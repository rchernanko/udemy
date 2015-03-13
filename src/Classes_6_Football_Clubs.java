public class Classes_6_Football_Clubs {

    public static void main(String[] args) {

        Classes_5_Football_Club tottenhamHotspur = new Classes_5_Football_Club();
        Classes_5_Football_Club arsenal = new Classes_5_Football_Club();
        Classes_5_Football_Club manchesterUnited = new Classes_5_Football_Club();

        tottenhamHotspur.name = "Tottenham Hotspur";
        tottenhamHotspur.stadiumName = "White Hart Lane";
        tottenhamHotspur.stadiumCapacity = 36_000;
        tottenhamHotspur.currentManager = "Maurichio Pochetino";
        tottenhamHotspur.obtainFootballClubDetails();

        arsenal.name = "Arsenal";
        arsenal.stadiumName = "The Emirates";
        arsenal.stadiumCapacity = 60_000;
        arsenal.currentManager = "Arsene Wenger";
        arsenal.obtainFootballClubDetails();

        manchesterUnited.name = "Manchester United";
        manchesterUnited.stadiumName = "Old Trafford";
        manchesterUnited.stadiumCapacity = 70_000;
        manchesterUnited.currentManager = "Louis Van Gaal";
        manchesterUnited.obtainFootballClubDetails();

    }
}
