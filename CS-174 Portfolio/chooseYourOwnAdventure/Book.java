package choose.your.own.adventure;

import java.util.HashMap;

/**
 *@author btdou
 * This class houses the methods 
 */
public class Book {
    //Declaration of Hashmap contents which will hold the contents of the story

    /**
     *
     */
    public static HashMap<String, Chapter> places = new HashMap<String, Chapter>();
    
    /**
     * this method will create and fill all the needed Chapter objects then place them in the HashMap
     */
    public static void buildBook(){
        // Start 1
        String Start = "It's late autumn day.  In your office, you're finishing up the paperwork for your\n "
                + " latest solved case, a busted bootleggers ring that has been supplying the local speakeasies.\n"
                + "  Suddenly, Benjamin your plucky assistant barges into the office with the phone cable\n"
                + "trailing behind him.  \"Boss,\" he begins, \"It's the governor!  He says it's urgent.\n\"  "
                + "You get up from your desk and take the phone from his hand, the governor sounds frantic,\n"
                + " \"Detective, my daughter, Morgan, and the nanny have gone missing!  It's been hours\n"
                + " since they've left for the store.  I didn't know who else to call. \n \n";
        String Start2 =  "Your options : \n"
                + "\"Don't be dramatic, they'll be home soon\" - Type 'Hang up' \n" //too 2
                + "\"This sounds serious Mr Governor, I'll take the case\" - Type 'Tell me more' "; //too 8
        Chapter p = new Chapter(Start, Start2, true);
        places.put("Beginning", p);
        places.put("Open Book", p);
        //End 1
        //Start 2
        String two = "After some time, a search party is organized and after weeks of searching,\n "
                + "the decaying corpses of both Morgan and her nanny are found in an old,\n"
                + "abandoned, flooded quarry.  The Governor mourns.  The end \n \n";
        String two2 = "Your options : \n"
                + "Start Over - Type 'Beginning' \n" //too Start
                + "Stop - Type 'End'"; //break loop
        Chapter q = new Chapter(two, two2, true);
        places.put("Search", q);
        places.put("Hang up", q);
        //End 2
        //Start 3
        String three = "You arrive at the bakery and see it is closed and boarded up.  However, you notice\n"
                + " an unusually large amount of people lining up at an inconspiciuous entrance nextdoor.\n"
                + "  You decide to enter and find it is a jazz club, you question the folks inside.  Being\n"
                + " that they would be the only persons present at the club during the time of the\n"
                + " dissapearence, general questioning continuously leads you too either, the door of the\n"
                + " owners office, a mysterious woman named Olivia, the end of the bar, where \n"
                + "Angelina, the manager sits with a man on her arm, or to Emelia the joints jazz singer\n"
                + " who is about to go onstage. \n \n";
        String three2= "Your Options : \n"
                + "Question Olivia - Type 'Olivia' \n"
                + "Question Angelina - Type 'Angelina' \n" //too five
                + "Question Emelia - Type 'Emelia' \n";
        Chapter r = new Chapter(three, three2, true);
        places.put("Bakery", r);
        //End 3
        //Start 4
        
        //End 4
        //Start 5
        String five = "You walk towards the Manager, produce a business card, and ask to talk.  She and\n "
                + "the man she's with exchange looks then after a brief pause, she waves him off so you\n"
                + " two can speak privately.  Upon broad questioning, Angelina answers your questions \n"
                + "dismissively.  However, when you lean into your interogation, she becomes visibly \n"
                + "distraught and begins to tell you everything...  \"If it weren't for that dirty rotten \n"
                + "no good governor taking advantage of that poor Emelia's love for him, none of this\n"
                + " would have had to happen.  Olivia's the one who took it too personally like always.\n"
                + "  She came up with the idea and I just had to get my hands dirty since she always has \n"
                + "me do her dirty work.\" You ask her where they're being held and she sighs,  \n"
                + "\"I guess there's no point in lying now.  You can find them in the basement of the \n"
                + "old bakery nextdoor. \n \n";
        String five2 = "Your Options \n"
                + "Go look nextdoor - Type 'Go nextdoor"; //to nine
        Chapter s = new Chapter(five, five2, true);
        places.put("Angelina", s);
        //End Five
        //Start Six
        String six = "You walk up to the owners office's door and knock...\n "
                + "The door opens to reveal Olivia, owner, lounging at \n"
                + "her desk, draped in a massive fur coat, smoking a long \n"
                + "cigarette.  You present your business card and ask to \n"
                + "question her.  She complies and asks you to close the door \n"
                + "and take a seat.  \"What is a private investigator like you \n"
                + "doing in a place like this?\" She asks you.  You respond \n"
                + "curtly saying your investigation of the Governors daughter's \n"
                + "disappearance has lead you here.  She responds saying,\n"
                + " \"Have you even looked for her?  I'm afraid I cannot help \n"
                + "you with this, sir.  I hear Morgans's a sweet girl but as \n"
                + "far as I am concerned, the governors rotten to the core and \n"
                + "doesn't deserve anymore of my time.\"  You ask why she \n"
                + "thinks this of the governor and she informs you that she has \n"
                + "no respect for people whom are not loyal to their lovers.  \n"
                + "Then, while passively brushing off further questioning, \n"
                + "Olivia mentions that Angelina, her manager, has had a criminal \n"
                + "background but clarifies that it was years ago.  You are \n"
                + "then asked to leave her office.  Since you feel that Olivia \n"
                + "has reached her limit of helpful information, you agree and \n"
                + "exit back into the jazz club.  You sit at the bar to think \n"
                + "over your conversation and conclude that it could be \n"
                + "productive to talk to the Governor to try and get some \n"
                + "info regarding his alleged affairs, or to speak to the manager; \n"
                + "Angelina, however, you begin to feel the pressure of time \n"
                + "and think it could also be a good idea to start physically \n"
                + "looking for the lost duo. \n \n";
        String six2 = "Your Options : \n"
                + "Talk to the Governor - Type 'Question Governor \n"
                + "Talk to Angelina - Type 'Angelina' \n"
                + "Put together a search party - Type 'Search'";
        Chapter t = new Chapter(six, six2, true);
        places.put("Olivia", t);
        //end six
        //Start seven
        String seven = "You walk up to the singer and catch her right as she is \n"
                + "about to walk onstage.  You quickly show your business card and \n"
                + "assure her you wont take much of her time.  She nervously looks \n"
                + "around then whispers under her breathe \"You'd better make this \n"
                + "quick.\"  You again, assure her it will only take a minute and \n"
                + "begin to ask Emelia about her whereabouts that day.  She acts \n"
                + "quite strange and does not give you very detailed information \n"
                + "about her day.  This is a red flag to you so you push her harder \n"
                + "She continues to frequently look around nervously and asks to \n"
                + "be done in order to go perform.  You tell her that you would \n"
                + "get out of her hair if only she told you a concrete explaination \n"
                + "of her day.  Nervously looking around once more, she responds \n"
                + "look, I was with the governor, not many people know this, but \n"
                + "we're in love...\"  You're a little shook however you stay calm \n"
                + "and ask who else knew abou their afair and are informed the only \n"
                + "person who knew was Emelias closest friend.  You are unsure who \n"
                + "she was aluding too but before you could ask for further clarification\n"
                + "she slipped away on stage and began her act \n \n";
        String seven2 = "Your Options : \n"
                + "Ask the governor to ask abouthis alleged affair - Type 'Governor'\n"
                + "Question her boss, Olivia - Type 'Olivia'\n";
        Chapter u = new Chapter(seven, seven2, true);
        places.put("Emelia", u);
        //ends seven
        //Start Eight
        String eight = "The governor tells you that this morning they went to run errands.  His driver \n"
                + "last saw them when he dropped them off at the bakery where they were going to pick \n"
                + "up bread to feed the ducks at the park.  Just before dinner, when the driver went to \n"
                + "pick them up, they were nowhere to be found and had not even been seen near the park. \n \n";
        String eight2 = "Your Options : \n"
                + "Put together a search party - Type 'Search' \n" //too two
                + "Go to the bakery - Type 'Bakery'"; //too three
        Chapter v = new Chapter(eight, eight2, true);
        places.put("Tell me more", v);
        //End Eight
        //Start Nine
        String nine = "You pry open the back door to what used to be the bakery and make your way down \n"
                + "the basement stairs.  As you get closer, you're hit with the overwhelming smell of\n"
                + " alcohol and realize that Jazz club ain't just a jazz club afterall.  You find Morgan\n"
                + " and her nanny tied up behind many barrels of the speakeasy's alcohol.  You walk the\n"
                + " shaken duo outside where Benjamin sits in your car awaiting your arrival.\n"
                + "  \"Its about time!\" he shouts your way as he starts up the engine.  \"I knew you'd\n"
                + " crack this one too, boss\"  You both drive Morgan and the Nanny home and are greeted\n"
                + " by a grateful Governor and you all live happily ever after <3";
        String nine2 = "";
        Chapter w = new Chapter(nine, nine2, false);
        places.put("Go nextdoor", w);
        //End Nine
        //Start ten
        String ten = "The governor doesn't believe his affairs are relevant\n"
                + "nor any of your business... He's a dead end.\n \n";
        String ten2 = "Your Option : \n"
                + "Go back one step - Type 'Emelia'";
        Chapter x = new Chapter(ten, ten2, true);
        places.put("Governor", x);
        //end ten
        //Start 11
        String eleven = "You ask the governor about his affairs.  At first, he is hesitant to provide \n"
                + "you with this personal information but once you explain how this could connect to \n"
                + "the case, he relents and provides you with the following list of people he's been with; \n \n"
                + "-Elizabeth Brown \n"
                + "-Dorothy Jefferson \n"
                + "-Emelia Ruth \n"
                + "-Margaret Lehigh \n \n";
        String eleven2 = "Your Options : \n"
                + "Question Elizabeth - Type 'Elizabeth' \n" //too 12
                + "Question Dorothy - Type 'Dorothy' \n" //too 13(12)
                + "Question Emelia - Type 'Emelia'" //too 7
                + "Question Margaret - Type 'Margaret"; //too 14(12)
        Chapter y = new Chapter(eleven, eleven2, true);
        places.put("Question Governor", y);
        //End 11
        //Start 12 (where you end up if you choose anyone but Emilia in 11
        String twelve = "Her alibi checks out... Dead end \n";
        String twelve2 = "Your Option \n"
                + "Go back to the previous stop to question other women on the list - \n"
                + "Type 'Question Governor";
        Chapter z = new Chapter(twelve, twelve2, true);
        places.put("Elizabeth", z);
        places.put("Dorothy", z);
        places.put("Margaret", z);
        //End 12
        
        
    }
    
    /**
     * This method takes the user input and returns the corresponding chapter of the book
     * @param key - the key used for the HashMap
     * @return - returns the string to be printed to the user
     */
    public static Chapter callChapter(String key){
        Chapter ret = places.get(key);
        return ret;
    }
    
}

