package student;

/**
 * This class is a placeholder which you will fully implement based on the javadoc
 *
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 *
 */

public class Greeting {

    /**
     * holds the localityID of the person
     */
    private final int localityID;
    /**
     * Holds the name of the locality
     */
    private String localityName;
    /**
     * Holds locality greeting
     */
    private String greeting;
    /**
     * Greeting using ascii characters
     */
    private String asciiGreeting;
    /**
     * Greeting using uni-code characters
     */
    private String unicodeGreeting;
    /**
     * format string for the greeting
     */
    private String formatStr;


    /**
     *
     * @param localityID ID of locality
     * @param localityName Name of locality
     */

    public Greeting(int localityID, String localityName){
        this.localityID = localityID;
        this.localityName = localityName;
        this.greeting = "Hello";
        this.asciiGreeting = this.greeting;
        this.unicodeGreeting = this.greeting;
        this.formatStr = "%s, %s!";
    }

    public Greeting(int localityID, String localityName, String greeting){
        this.localityID = localityID;
        this.localityName = localityName;
        this.greeting = (greeting != null) ? greeting : "Hello";
        this.asciiGreeting = this.greeting;
        this.unicodeGreeting = this.greeting;
        this.formatStr = "%s, %s!";
    }

    public Greeting(int localityID, String localityName, String asciiGreeting, String unicodeGreeting, String formatStr){
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    public int getLocalityID(){
        return this.localityID;
    }

    public String getLocalityName(){
        return this.localityName;
    }

    public String getAsciiGreeting(){
        return this.asciiGreeting;
    }

    public String getUnicodeGreeting(){
        return unicodeGreeting;

    }

    public String getFormatStr(){

        if (asciiGreeting != null){
            return String.format(formatStr, "%s", unicodeGreeting);
        }

        return String.format(formatStr, greeting, "%s");
    }

    public String getFormatStr(boolean asciiOnly) {

        if (asciiOnly) {
            return String.format(formatStr, "%s", asciiGreeting);
        }

        return String.format(formatStr, greeting,"%s");
    }

    @Override
    public String toString() {
        return String.format("{localityID:%d, localityName:\"%s\", asciiGreeting:\"%s\", unicodeGreeting:\"%s\"}",
                localityID, localityName, asciiGreeting, unicodeGreeting);
    }


    public static void main(String[] args) {

        Greeting usa = new Greeting(2, "USA");
        Greeting hawaii = new Greeting(1, "Hawaii", "Aloha");
        Greeting china = new Greeting(3, "China", "Ni Hao", "你好", "%s, %s!");

        String name = "John";
        String usaGreeting = String.format(usa.getFormatStr(), name);
        String hawaiiGreeting = String.format(hawaii.getFormatStr(), name);
        String chinaGreeting1 = String.format(china.getFormatStr(), name);
        String chinaGreeting2 = String.format(china.getFormatStr(true), name);

        // Get the format string with ASCII greeting
        System.out.println(usaGreeting); // Output: Hello, John!
        System.out.println(hawaiiGreeting); // Output: Aloha, John!
        System.out.println(chinaGreeting1); // Output: John, 你好!
        System.out.println(chinaGreeting2); // Output: John, Ni Hao!
    }

    }



