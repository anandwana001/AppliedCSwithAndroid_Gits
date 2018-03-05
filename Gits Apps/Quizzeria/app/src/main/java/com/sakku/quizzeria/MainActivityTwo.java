package com.sakku.quizzeria;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sakina on 2/9/2018.
 */

public class MainActivityTwo extends AppCompatActivity {

    int test,counter = 0;
    private ArrayList<Test> androidTest = new ArrayList<>();        //questions
   // private ArrayList<Test> javaTest= new ArrayList<>();        //questions
    //private ArrayList<Test> cPlustest= new ArrayList<>();        //questions
    // private ArrayList<Test> cTest= new ArrayList<>();        //questions

    Button option1,option2,option3,option4,quit;
    TextView questionText;
    private int score=0;
    TextView testScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);
        testScore = findViewById(R.id.name);
        if (getIntent() != null) {
            //getIntent().getStringExtra("name1");
            switch (getIntent().getIntExtra("test", 0)) {
                case 1:
                    initialiseQuestionForAndroid();//android
                    break;
                case 2:
                    initialiseQuestionForCPlus();    ////c++
                    break;
                default:
                    initialiseQuestionForJava();      //java
            }


        }


        //option 1
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);
        questionText = findViewById(R.id.question_text);

        showTest();

        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkTestLength()) {
                    if (checkAnswer(option1.getText().toString())) {
                        counter++;
                        score += 2;
                        testScore.setText("Current score is " + score);
                        showTest();
                        //endProg();
                    } else {
                        counter++;                          //goto next questio //call showtext
                        showTest();
                        //endProg();

                    }
                } else endProg();

            }
        });

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkTestLength()) {
                    if (checkAnswer(option2.getText().toString())) {
                        counter++;
                        score += 2;
                        testScore.setText("Current score is " + score);
                        showTest();
                        //endProg();
                    } else {
                        counter++;                          //goto next questio //call showtext
                        showTest();
                        //endProg();

                    }
                } else endProg();
            }
        });
        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkTestLength()) {
                    if (checkAnswer(option3.getText().toString())) {
                        counter++;
                        score += 2;
                        //endProg();
                        testScore.setText("Current score is " + score);
                        showTest();
                    } else {
                        counter++;                          //goto next questio //call showtext
                        showTest();
                        //endProg();

                    }
                } else endProg();

            }
        });
        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkTestLength()) {
                    if (checkAnswer(option4.getText().toString())) {
                        counter++;
                        score += 2;
                        testScore.setText("Current score is " + score);
                        showTest();
                        //endProg();
                    } else {
                        counter++;                          //goto next questio //call showtext
                        showTest();
                        //endProg();

                    }
                } else endProg();
            }
        });
    }

    private void showTest()
    {

        //1 question

        Test question = androidTest.get(counter);
        //1 textview -> call setText
        questionText.setText(question.getQuestion());
        option1.setText(question.getOptionA());
        option2.setText(question.getOptionB());
        option3.setText(question.getOptionC());
        option4.setText(question.getOptionD());
    }

    private boolean checkTestLength()
    {
        if(counter >= androidTest.size()-1)
            return  true;
        else  return false;
    }

    private void endProg()
    {

            Intent intent = new Intent(MainActivityTwo.this, MainActivityThree.class);
            intent.putExtra("score" , score);
            intent.putExtra("name1", getIntent().getStringExtra("name1"));
            startActivity(intent);
            finish();
    }

    private boolean checkAnswer(String userAnswer)
    {
       if(userAnswer.equalsIgnoreCase(androidTest.get(counter).getCorrectAnswer()))
           return true;
       else return  false;
    }

    private void setQuit(View view)
    {
        Intent intent = new Intent(MainActivityTwo.this , MainActivityThree.class);
        startActivity(intent);
    }
//    public void go_to_next(View view)
//    {
//        Intent intent = new Intent(MainActivityTwo.this, MainActivityThree.class);
//        startActivity(intent);
//    }
//    public void quit()
//    {
//        System.exit(0);
//    }

    private void initialiseQuestionForAndroid() {
        Test question = new Test();
        question.setQuestion("What method you should override to use Android menu system?");
        question.setOptionA("onCreateOptionsMenu()");
        question.setOptionB("onCreateOptions");
        question.setOptionC("onCreate");
        question.setOptionD("on");
        question.setCorrectAnswer("onCreateOptionsMenu()");
        androidTest.add(question);

        question = new Test();
        question.setQuestion("What Activity method you use to retrieve a reference to an Android view by using the id attribute of a resource XML?");
        question.setOptionA("findViewByReference(int id);");
        question.setOptionB("findViewById(int id)");
        question.setOptionC("retrieveResourceById(int id)");
        question.setOptionD("findViewById(String id)");
        question.setCorrectAnswer("findViewById(int id)");
        androidTest.add(question);

        question = new Test();
        question.setQuestion("Which of the following is NOT a valid usage for Intents?");
        question.setOptionA("Activate and Activity");
        question.setOptionB(" Activate a Service");
        question.setOptionC("Activate a Broadcast receiver");
        question.setOptionD("Activate a SQLite DB Connection");
        question.setCorrectAnswer("Activate a SQLite DB Connection");
        androidTest.add(question);

        question = new Test();
        question.setQuestion("Which configuration file holds the permission to use the internet?");
        question.setOptionA("Layout file");
        question.setOptionB("Property file");
        question.setOptionC("Java source file");
        question.setOptionD("Manifest file");
        question.setCorrectAnswer("Manifest file");
        androidTest.add(question);

        question = new Test();
        question.setQuestion(" Which of these is not defined as a process state?");
        question.setOptionA("Non-visible");
        question.setOptionB("Visible");
        question.setOptionC("Foreground");
        question.setOptionD("Background");
        question.setCorrectAnswer("Non-visible");
        androidTest.add(question);
    }

    private void initialiseQuestionForJava()
    {
        Test question = new Test();
        question.setQuestion("What is the default value of int variable?");
        question.setOptionA("0");
        question.setOptionB("0.0");
        question.setOptionC("not defined");
        question.setOptionD("null");
        question.setCorrectAnswer("0");
        androidTest.add(question);

        question = new Test();
        question.setQuestion("What does AWT stands for?");
        question.setOptionA("All Window Tools");
        question.setOptionB("All Writing Tools");
        question.setOptionC("Abstract Window Toolkit");
        question.setOptionD("Abstract Writing Toolkit");
        question.setCorrectAnswer("Abstract Writing Toolkit");
        androidTest.add(question);

        question = new Test();
        question.setQuestion("Which of these class is superclass of String and StringBuffer class?");
        question.setOptionA("java.util");
        question.setOptionB("java.lang");
        question.setOptionC("ArrayList");
        question.setOptionD("None of the mentioned.");
        question.setCorrectAnswer("java.lang");
        androidTest.add(question);

        question = new Test();
        question.setQuestion("Which of these constructors is used to create an empty String object?");
        question.setOptionA("String()");
        question.setOptionB("String(void)");
        question.setOptionC("String(0)");
        question.setOptionD("None of the mentioned");
        question.setCorrectAnswer("String()");
        androidTest.add(question);


        question = new Test();
        question.setQuestion("The sequence \\n does what?");
        question.setOptionA("Makes a link");
        question.setOptionB("Prints a backslash followed by a n");
        question.setOptionC("Adds 5 spaces");
        question.setOptionD("Starts a new line");
        question.setCorrectAnswer("Starts a new line");
        androidTest.add(question);

    }
    public void initialiseQuestionForCPlus()
    {
        Test question = new Test();
        question.setQuestion("Which of following is not a valid name for a C variable?");
        question.setOptionA("Examveda");
        question.setOptionB("Exam_veda");
        question.setOptionC("Exam veda");
        question.setOptionD("Both A and B");
        question.setCorrectAnswer("Exam veda");
        androidTest.add(question);

        question = new Test();
        question.setQuestion("Find the output of the following program. void main() { int i=01289; printf(\"%d\", i); }?");
        question.setOptionA("0289");
        question.setOptionB("1289");
        question.setOptionC("syntax error");
        question.setOptionD("713");
        question.setCorrectAnswer("syntax error");
        androidTest.add(question);

        question = new Test();
        question.setQuestion("Find the output of the following program.\n" +
                "void main()\n" +
                "{\n" +
                "   int i=065, j=65;\n" +
                "   printf(\"%d %d\", i, j);\n" +
                "}");
        question.setOptionA("53 65");
        question.setOptionB("65 65");
        question.setOptionC("065 65");
        question.setOptionD("053 65");
        question.setCorrectAnswer("53 65");
        androidTest.add(question);

        question = new Test();
        question.setQuestion("If ASCII value of 'x' is 120, then what is the value of the H, if\n" +
                "H = ('x' – 'w' ) / 3;?");
        question.setOptionA("1");
        question.setOptionB("0");
        question.setOptionC("2");
        question.setOptionD("4");
        question.setCorrectAnswer("0");
        androidTest.add(question);

        question = new Test();
        question.setQuestion(" what is by default value of a integer value in c++");
        question.setOptionA("0");
        question.setOptionB("null");
        question.setOptionC("garbage value");
        question.setOptionD("0.0");
        question.setCorrectAnswer("garbage value");
        androidTest.add(question);

    }


}


