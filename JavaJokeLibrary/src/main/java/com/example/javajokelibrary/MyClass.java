package com.example.javajokelibrary;

import java.util.Random;

public class MyClass {
    public String getJokes()
    {
        String[] joke=new String[5];
        joke[0]="A: I have the perfect son. \n" +
                "B: Does he smoke? \n" +
                "A: No, he doesn't. \n" +
                "B: Does he drink whiskey? \n" +
                "A: No, he doesn't. \n" +
                "B: Does he ever come home late? \n" +
                "A: No, he doesn't. \n" +
                "B: I guess you really do have the perfect son. How old is he? \n" +
                "A: He will be six months old next Wednesday.";
        joke[1]="Girl: You would be a good dancer except for two things. \n" +
                "Boy: What are the two things? \n" +
                "Girl: Your feet. ";
        joke[2]="The doctor to the patient: 'You are very sick' \n" +
                "The patient to the doctor: 'Can I get a second opinion?' \n" +
                "The doctor again: 'Yes, you are very ugly too...'";
        joke[3]="A man goes to the doctor and says, \"Doctor, wherever I touch, it hurts.\" \n" +
                "The doctor asks, \"What do you mean?\" \n" +
                "The man says, \"When I touch my shoulder, it really hurts. If I touch my knee - OUCH! When I touch my forehead, it really, really hurts.\" \n" +
                "The doctor says, \"I know what's wrong with you - you've broken your finger!\" ";
        joke[4]="Headmaster: I've had complaints about you, Johnny, from all your teachers. What have you been doing? \n" +
                "Johnny: Nothing, sir. \n" +
                "Headmaster: Exactly. ";
        Random random=new Random();
        return joke[random.nextInt(joke.length)];
    }
}
