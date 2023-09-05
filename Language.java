class Language {

// instance variables
protected String name;
protected int numSpeakers;
protected String regionSpoken;
protected String wordOrder;

// contructor - must have same name as class
public Language(String name, int numSpeakers, String regionSpoken, String wordOrder) {
  this.name = name;
  this.numSpeakers = numSpeakers;
  this.regionSpoken = regionSpoken;
  this.wordOrder = wordOrder;
}


// method
public void getInfo() {
  System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionSpoken + "." + " The language follows the word order: " + this.wordOrder + ".");
}

// main method
public static void main(String[] args) {
  Language spanish = new Language("Spanish", 555000000, "Spain, and Latin America, and Equatorial Guinea", "subject-verb-object");
  spanish.getInfo();

  Language chontal = new Mayan("Chontal", 60000);
  chontal.getInfo();

  Language mandarin = new SinoTibetan("Madarin Chinese", 1110000000);
    mandarin.getInfo();

  Language burmese = new SinoTibetan("Burmese", 43000000);
    burmese.getInfo();
}

}