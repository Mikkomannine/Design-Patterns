package Facade;



public class FacadeDemo {
    public static void main(String[] args) {
        ApiFacade apiFacade = new ApiFacade();

        // Fetch a random Chuck Norris joke
        String jokeApiUrl = "https://api.chucknorris.io/jokes/random";
        String jokeAttribute = "value";

        try {
            String joke = apiFacade.getAttributeValueFromJson(jokeApiUrl, jokeAttribute);
            System.out.println("Chuck Norris Joke: " + joke);
        } catch (Exception e) {
            System.err.println("Error fetching joke: " + e.getMessage());
        }

        // Fetch foreign exchange rates (example with a different API)
        String forexApiUrl = "https://open.er-api.com/v6/latest/USD";
        String forexAttribute = "rates";

        try {
            String forexRates = apiFacade.getAttributeValueFromJson(forexApiUrl, forexAttribute);
            System.out.println("Forex Rates: " + forexRates);
        } catch (Exception e) {
            System.err.println("Error fetching forex rates: " + e.getMessage());
        }
    }
}
