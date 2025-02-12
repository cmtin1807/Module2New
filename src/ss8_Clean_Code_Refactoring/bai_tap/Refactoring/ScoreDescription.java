package ss8_Clean_Code_Refactoring.bai_tap.Refactoring;

import static ss8_Clean_Code_Refactoring.bai_tap.Refactoring.TennisConstants.*;

class ScoreDescription {

    public static String getScoreDescription(int score) {
        switch (score) {
            case LOVE:
                return "Love";
            case FIFTEEN:
                return "Fifteen";
            case THIRTY:
                return "Thirty";
            case FORTY:
                return "Forty";
            default:
                throw new IllegalArgumentException("Invalid score: " + score);
        }
    }

    public static String getEqualScore(int score) {
        switch (score) {
            case LOVE:
                return "Love-All";
            case FIFTEEN:
                return "Fifteen-All";
            case THIRTY:
                return "Thirty-All";
            case FORTY:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }
}
