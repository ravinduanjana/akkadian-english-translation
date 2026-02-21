package com.example.nmtbackend.controller;

import com.example.nmtbackend.model.Translation;
import com.example.nmtbackend.repository.TranslationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.HashMap;
import java.util.Map;
@CrossOrigin(origins = "http://localhost:3000") // Add this line!
@RestController
@RequestMapping("/api")

public class TranslationController {

    @Autowired
    private TranslationRepository translationRepository;

    @PostMapping("/translate")
    public Map<String, String> translate(@RequestBody Map<String, String> body) {
        String text = body.get("text");

        // 1. Call your Python API
        RestTemplate restTemplate = new RestTemplate();
        String pythonUrl = "http://localhost:8000/translate";

        Map<String, String> request = new HashMap<>();
        request.put("text", text);

        try {
            // We use Map.class to get the JSON response from Python
            Map<String, Object> response = restTemplate.postForObject(pythonUrl, request, Map.class);

            // MATCHING YOUR PYTHON CODE: Look for "translation" instead of "translated_text"
            if (response != null && response.containsKey("translation")) {
                String translatedResult = response.get("translation").toString();

                // 2. SAVE TO DATABASE
                Translation history = new Translation(text, translatedResult);
                translationRepository.save(history);

                // Return the same format to your frontend
                Map<String, String> finalResponse = new HashMap<>();
                finalResponse.put("translation", translatedResult);
                return finalResponse;
            }
        } catch (Exception e) {
            // This will print the error in your IntelliJ console if something else goes wrong
            e.printStackTrace();
        }

        return null;
    }
}