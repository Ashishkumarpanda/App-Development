package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button btn1,btn2,btn3;
    String[] questions = {"The atomic number for lithium is 17",
            "A cross between a horse and a zebra is called a 'Hobra",
            "The black box in a plane is black",
            "Alliumphobia is a fear of garlic",
            "Sex Education star Gillian Anderson was born in Chicago, Illinois",
            "Prince Harry is taller than Prince William",
            "The star sign Aquarius is represented by a tiger",
            "Meryl Streep has won two Academy Awards",
            "Marrakesh is the capital of Morocco",
            "Idina Menzel sings 'let it go' 20 times in 'Let It Go' from Frozen",
            "Waterloo has the greatest number of tube platforms in London",
            "M&M stands for Mars and Moordale",
            "Gin is typically included in a Long Island Iced Tea",
            "The unicorn is the national animal of Scotland",
            "There are two parts of the body that can't heal themselves",
            "Howard Donald is the oldest member of Take That",
            "The Great Wall of China is longer than the distance between London and Beijing",
            "There are 219 episodes of Friends",
            "'A' is the most common letter used in the English language",
            "A lion's roar can be heard up to eight kilometres away",
            "In Harry Potter, Draco Malfoy has no siblings",
            "Louis Walsh is older than Simon Cowell",
            "Monaco is the smallest country in the world",
            "'What Do You Mean' was Justin Bieber's first UK number one single",
            "The river Seine in Paris is longer than the river Thames in London",
            "A cara cara navel is a type of orange",
            "There are five different blood groups",
            "Cinderella was the first Disney princess",
            "ASOS stands for As Seen On Screen",
            "The Battle Of Hastings took place in 1066",
            "H&M stands for Hennes & Mauritz",
            "Canis lupur is the scientific name for a wolf",
            "K is worth four points in Scrabble",
            "Alaska is the biggest American state in square miles",
            "Ariana Grande is 25 or under",
            "Australia is wider than the moon",
            "Queen Elizabeth II is currently the second longest reigning British monarch",
            "Madonna's real name is Madonna",
            "Serena Williams has one more singles tennis Grand Slam titles than sister Venus",
            "Alexander Fleming discovered penicillin",
            "Harry Styles' middle name is Edward",
            "Your 'radius' bone is in your leg",
            "Coffee is made from berries",
            "Drag Race's Michelle Visage is older than RuPaul",
            "The only letter not in the periodic table is the letter J",
            "Jordan North won I'm A Celebrity... Get Me Out Of Here! in 2020",
            "The small intestine is about three-and-a-half times the length of your body",
            "An octopus has three hearts",
            "Thomas Edison discovered gravity",
            "Walt Disney holds the record for the most Oscars",
            "Spaghetto is the singular word for a piece of spaghetti",
            "Venus is the hottest planet in the solar system",
            "Hillary Clinton and Celine Dion are related",
            "Cardi B's real name is Cardigan Backyardigan",
            "Bananas are curved because they grow upwards towards the sun",
            "The five rings on the Olympic flag are interlocking",
            "Fish cannot blink",
            "Friends star Lisa Kudrow was originally cast in Frasier",
            "Goldfish have a two second memory",
            "50 Cent and Charlie Chaplin were alive at the same time",
            "There are 14 bones in a human foot",
            "Hot and cold water sound the same when poured.",
            "There have been seven million pound winners on Who Wants to Be a Millionaire." ,
            "Meghan Markle's first name is Rachel.",
            "In Finding Nemo the protagonist is a pufferfish.",
            "In a deck of cards, the king has a mustache.",
            "When the two numbers on opposite sides of a dice are added together it always equals 7." ,
            "In the English language there is no word that rhymes with orange.",
            "Hippos sweat a red substance.",
            "Sex and the City star Kim Cattrall is from California"};
    boolean[] answers = {false,false,false,true,true,false,true,false,false,false,true,false,true,true,false,true,true,false,false,true,
                        false,true,false,true,true,true,false,false,true,true,true,false,false,true,false,true,false,true,true,true,
                        true,false,true,false,true,false,true,true,false,true,true,true,false,false,true,true,true,true,false,true,
                        false,false,false,true,false,false,true,true,true,false};
    private int index = 0;
    private int scores = 0;
    public static  int  score ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.questions);
        btn1 = findViewById(R.id.yes);
        btn2 = findViewById(R.id.no);
        btn3 = findViewById(R.id.button4);



        textView.setText(questions[index]);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index<questions.length)
                {
                    if(answers[index])
                    {
                        scores++;
                    }
                    index++;
                    btn1.setVisibility(index==questions.length?View.GONE:View.VISIBLE);
                    btn2.setVisibility(index==questions.length?View.GONE:View.VISIBLE);
                    textView.setText("DONE");
                    if(index<questions.length)
                    {
                        textView.setText(questions[index]);
                    }
                    else
                    {
//                        Toast.makeText(MainActivity.this, "Your Score Is "+scores, Toast.LENGTH_SHORT).show();
                    }
                }



            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index<questions.length)
                {
                    if(!answers[index])
                    {
                        scores++;
                    }
                    index++;
                    btn1.setVisibility(index==questions.length?View.GONE:View.VISIBLE);
                    btn2.setVisibility(index==questions.length?View.GONE:View.VISIBLE);
                    textView.setText("DONE");
                    if(index<questions.length)
                    {
                        textView.setText(questions[index]);
                    }
                    else
                    {
//                        Toast.makeText(MainActivity.this, "Your Score Is "+scores, Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });



        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==questions.length)
                {
                    score = scores;
                    Intent intent = new Intent(view.getContext(),EnterName.class);
                    intent.putExtra(String.valueOf(score),scores);
                    startActivity(intent);

                }
                else
                {
                    score = scores;
                    Intent intent = new Intent(view.getContext(),EnterName.class);
                    intent.putExtra(String.valueOf(score),scores);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, String.valueOf(questions.length-index)+" "+"Questions Left", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}