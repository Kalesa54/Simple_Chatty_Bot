class Main {
    public static void main(String[] args) {
        // put your code here
        String stars = "";
        String stars2 = "      ";
        String twoStars = "**";
        String fourWhite = "    ";
        String oneWhite = " ";
        String sevenStars = "*******";

        String conString = stars.concat("********");
        String conString2 = stars2.concat("**");
        String conString3 = twoStars.concat(fourWhite);
        String conString4 = conString3.concat(twoStars);
        String conString5 = oneWhite.concat(sevenStars);

        System.out.println(conString);
        System.out.println(conString2);
        System.out.println(conString2);
        System.out.println(conString2);
        System.out.println(conString4);
        System.out.println(conString4);
        System.out.println(conString5);
    }
}
