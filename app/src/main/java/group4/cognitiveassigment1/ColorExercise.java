package group4.cognitiveassigment1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import java.util.Random;

public class ColorExercise extends ActionBarActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.color_exercise);

            //changeColor("blue");
        }
/**
        int Min = 4;
        int Max = 10;

        public Void changeColor(String color) {
        //set a random time of change
            int randomTimeChange = Min + (int)(Math.random() * ((Max - Min) + 1));
        //change of color, doesn't work yet
        // we should change color after that random time
            setBackground("@color/blue");
        }
**/
}
