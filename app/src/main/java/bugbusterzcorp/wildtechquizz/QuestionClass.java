package bugbusterzcorp.wildtechquizz;

import android.widget.EditText;




public class QuestionClass {
    private String mQuestion;
    private String mChoiceA;
    private String mChoiceB;
    private String mCorrectAnswer;



    public QuestionClass(){}

    public QuestionClass(String question, String choiceA, String choiceB, String correctAnswer){
        mQuestion = question;
        mChoiceA = choiceA;
        mChoiceB = choiceB;
        mCorrectAnswer = correctAnswer;

    }



    public String getmQuestion() {
        return mQuestion;
    }

    public String getChoiceA() {
        return mChoiceA;
    }

    public String getChoiceB() {
        return mChoiceB;
    }

    public String getCorrectAnswer() {
        return mCorrectAnswer;
    }


    public void setmQuestion(String mQuestion) {
        this.mQuestion = mQuestion;
    }

    public void setmChoiceA(String mChoiceA) {
        this.mChoiceA = mChoiceA;
    }

    public void setmChoiceB(String mChoiceB) {
        this.mChoiceB = mChoiceB;
    }

    public void setmCorrectAnswer(String mCorrectAnswer) {
        this.mCorrectAnswer = mCorrectAnswer;
    }


}
