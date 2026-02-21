

\## Model File Notice
# Akkadian to English Translation Web Application

## Project Overview
This project is a neural machine translation system that translates Akkadian to English.  
The model was trained using a Kaggle competition dataset.

## Technologies Used
- Uvicorn
- PyTorch
- Hugging Face Transformers
- SentencePiece
- NumPy
- Pandas

## Project Structure
- frontend/ → User interface
- backend/ → spring boot model training code

## Trained Model File

Due to GitHub's 100MB file limit, the trained model (288MB) is hosted externally:

[Download Trained Model] (https://drive.google.com/drive/folders/1ZgD2TUqaCS0y51RCoRpczZKBVWSL2wcz?usp=sharing)

After downloading, place the model file inside the backend folder before running the application.

## How to Run

1. Install dependencies:
   pip install -r requirements.txt

2. Start the backend server:
   uvicorn main:app --reload  (uvicorn main:app --reload --port 8000)

3. Open the frontend in browser.

## Accuracy
BLEU Score: 33.68

## Features
- Akkadian to English translation
- Preprocessing and tokenization
- Real-time inference


## Kaggle Competition
[https://www.kaggle.com/competitions/deep-past-initiative-machine-translation/overview ]


# Akkadian to English Translation Application

This project is a Machine Learning based application that translates
transliterated Akkadian text into English using a Neural Machine Translation (NMT) model.
 
The model was trained using a Kaggle competition dataset.

