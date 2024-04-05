package com.st10449069.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var etPersonAge : EditText? = null
    private var tvDisplayAnswer : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etPersonAge = findViewById(R.id.etAge)
        tvDisplayAnswer = findViewById(R.id.tvDisplay)

        val btnGeneratreHistory = findViewById<Button>(R.id.btnGenerate)
        btnGeneratreHistory.setOnClickListener{
            generateHistory()
        }

        val btnClearScreen = findViewById<Button>(R.id.btnClearScreen)
        btnClearScreen.setOnClickListener{
            clearTheScreen()
        }
    }

    private fun clearTheScreen() {
        // clear the etPersonAge box
        // clear tvDisplay

        etPersonAge?.text = null
        tvDisplayAnswer?.text = ""
    }

    private fun generateHistory() {
        // read the age
        // validate the age (error?)

        //find the age in the data set
        // display answer or display no answer

        var intAge : Int = 0
        var strOutput = ""

        val strEnteredValue = etPersonAge?.text.toString().trim()

        if (strEnteredValue.isEmpty()){
            etPersonAge?.error = "Enter a number"
            return
        }
        try{
            intAge = strEnteredValue.toInt()
            if (intAge < 20 || intAge > 100){
                //tvDisplayAnswer?.text = "Error - Invalid Age"
                etPersonAge?.error = "Invalid Age"
            }else{
                when (intAge) {
                    20 -> strOutput = "Jahseh Dwayne Ricardo Onfroy known as XXXTentacion was a rapper and singer-songwriter. Passed away in 2018."
                    32 -> strOutput = "Bruce Lee was a Hong Kong-American martial artist and actor. Passed away in 1973."
                    48 -> strOutput = "Whitney Elizabeth Houston was a singer, record producer, actress and philanthropist. Passed away in 2012."
                    57 -> strOutput = "Charles Quinton Murphy was an comedian, writer and actor in the film 'Norbit'. Passed away in 2017."
                    60 -> strOutput = "Carrie Frances Fisher was a writer and actor on 'Star Wars'. Passed away in 2016."
                    74 -> strOutput = "Muhammad Ali was a activist and professional boxer who was regarded as the greatest heavyweight champion. Passed away in 2016."
                    82 -> strOutput = "Neil Alden Armstrong was a aeronautical engineer and astronaut who was the first man to walk on the moon. Passed away in 2012."
                    90 -> strOutput = "Charles Edward Anderson Berry was a singer, guitarist and songwriter who pioneered rock and roll."
                    25 -> strOutput = "Tupac Amaru Shakur known as 2Pac was a influential rapper. Passed away in 1996."
                    39 -> strOutput = "Anna Nicole Smith was model, television personality and actress. Passed away in 2007."
                    42 -> strOutput = "Gilda Susan Radner was a singer, comedian, writer and actress. Passed away in 1989."
                    51 -> strOutput = "Ronit Elkabetz was an film director, screenwriter and actress on 'Black Notebooks'. Passed away in 2016."
                    63 -> strOutput = "Robin McLaurin Williams was a comedian and actor on 'Jumanji'. Passed away in 2014."
                    79 -> strOutput = "Dame Elizabeth Rosemond Taylor was a British and American actress on 'Cleopatra'. Passed away in 2011."
                    88 -> strOutput = "Chloe Anthony Wofford Morrison known as Toni Morrison was a editor and novelist for 'The Bluest Eye'. Passed away in 2019."
                    91 -> strOutput = "Ruby Dee was a play writer, journalist, civil rights activist and actress in 'Cop and a half'. Passed away in 2014."
                    22 -> strOutput = "Aaliyah Dana Haughton was a singer and actress. Passed away in 2001."
                    38 -> strOutput = "John Fitzgerald Kennedy Jr. was a journalist, magazine publisher and attorney. Passed away in 1999."
                    45 -> strOutput = "Freddie Mercury was a British singer and songwriter who achieved world fame as the lead vocalist and pianist of the rock band 'Queen'. Passed away in 1991."
                    54 -> strOutput = "Johnathan Southworth Ritter was a actor in 'Problem Child'. Passed away in 2003."
                    61 -> strOutput = "William Paxton was a filmmaker and actor in 'Apollo 13'. Passed away in 2017."
                    71 -> strOutput = "John R. Cash was a singer-songwriter. Passed away in 2003."
                    83 -> strOutput = "Paul Leonardo Newman was a film director, racing driver, philanthropist and actor in 'Cars'. Passed away in 2008."
                    92 -> strOutput = "Ravi Shankar KBE was an Indian sitarist and composer. Passed away in 2012."
                    28 -> strOutput = "Brandon Bruce Lee was an actor in 'Rapid Fire'. Passed away in 1993."
                    36 -> strOutput = "Diana, Princess of Wales was a member of the British royal family. Passed away in 1997."
                    40 -> strOutput = "Paul William Walker IV was an actor in 'Fast and Furious'. Passed away in 2013."
                    50 -> strOutput = "Bernard Jeffrey McCullough known as Bernie Mac was a comedian and actor in 'Ocean's Eleven'. Passed away in 2008."
                    68 -> strOutput = "Anthony David Leighton Scott was a film director and producer. Passed away in 2012."
                    72 -> strOutput = "Marion Robert Morrison known as John Wayne was an American actor in 'El Dorado'. Passed away in 1979."
                    86 -> strOutput = "Maya Angelou was a memoirist, poet and civil rights activist. Passed away in 2014."
                    96 -> strOutput = "Cecily Louise 'Cicely' Tyson was a actress in 'Madea's Family Reunion' known for her portrayal of strong African-American women. Passed away in 2021."
                    23 -> strOutput = "River Jude Phoenix was a musician and actor in 'Dark Blood'. Passed away in 1993."
                    35 -> strOutput = "Kierman Jarryd Forbes known as AKA was a South African rapper, record producer and businessman. Passed away in 2023."
                    47 -> strOutput = "Judy Garland was a singer and actress in 'The Wizard Of Oz'. Passed away in 1969."
                    56 -> strOutput = "Steven Paul Jobs was a businessman, inventor and investor known for co-founding the technology Apple Inc. Passed away in 2011."
                    65 -> strOutput = "Isaac Lee Hayes Jr. was a singer, songwriter, composer and actor. Passed away in 2008."
                    76 -> strOutput = "Aretha Louise Franklin was a singer, songwriter and pianist. Passed away in 2018."
                    87 -> strOutput = "Richard Wayne Penniman known as Little Richard was a singer, pianist and songwriter. Passed away in 2020."
                    97 -> strOutput = "Doris Day was an American actress and singer. Passed away in 2019."
                    27 -> strOutput = "Costantinos Tsobanoglou known as Costa Titch was a rapper and dancer. Passed away in 2023."
                    33 -> strOutput = "Christopher Crosby Farley was a comedian and actor in 'Beverly Hills Ninja'. Passed away in 1997."
                    44 -> strOutput = "Billie Holiday known as Lady Day was a jazz and swing music singer. Passed away in 1959."
                    52 -> strOutput = "Grace Patricia Kelly known as Grace of Monaco was a actress and Princess of Monaco as the wife of Prince Rainier III. Passed away in 1982."
                    34 -> strOutput = "Rikhado Muziwendlovu Chifaro Makhado known as Ricky Rick was a aSouth African rapper, singer and songwriter. Passed away in 2022."
                    69 -> strOutput = "Jerome Bernard Orbach was a singer and actor in 'Beauty and the Beast'. Passed away in 2004."
                    77 -> strOutput = "Lucille Desiree Ball was an American actress, comedian and studio executive. Passed away in 1989."
                    80 -> strOutput = "Mary Tyler Moore was a actress, producer and social advocate. Passed away in 2017."
                    99 -> strOutput = "Zsa Zsa Gabor was a Hungarian-American socialite and actress. Passed away in 2016."

                    else-> {
                        strOutput = "Nothing in data set"

                    }
                }
            }
            tvDisplayAnswer?.text =strOutput
        } catch (e: NumberFormatException){
            etPersonAge?.error = "Enter a valid number"
        }

        /*
        if (intAge < 20 || intAge > 100){
            //tvDisplayAnswer?.text = "Error - Invalid Age"
        } else {
            when (intAge) {
                21 -> strOutput = "s21"
                23 -> strOutput = "s23"
                else -> {
                    strOutput = "Nothing in data set"
                  {
               {
            {
            tvDisplayAnswer?.text = strOutput
         */
    }
    private fun clear(){

        etPersonAge?.text = null
        tvDisplayAnswer?.text = ""
    }
}