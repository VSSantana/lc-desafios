import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Desafio5 {

    public static void main(String[] args) {

        Map<String, Map<String, Double>> mapping = new HashMap<>();

        mapping.put("USD", new HashMap<>());
        mapping.put("BRL", new HashMap<>());
        mapping.put("EUR", new HashMap<>());

        mapping.get("USD").put("AUD", 1.44);
        mapping.get("USD").put("BRL", 5.15);
        mapping.get("BRL").put("EUR", 0.18);
        mapping.get("EUR").put("GBP", 0.86);

        System.out.println("Conversion from GBP to USD: " + converter("GBP", "USD", mapping));

    }

    public static Double converter(String origin, String destiny, Map<String, Map<String, Double>> mapping) {

        Map<String, Map<String, Double>> combinations = new HashMap<>(mapping);
        Double conversionRate = -1.0;

        for (String origingCurrency : mapping.keySet()) {

            final Map<String, Double> destinyMapping = mapping.get(origingCurrency);

            for (String destinyCurrency : destinyMapping.keySet()) {

                if (!combinations.containsKey(destinyCurrency)) {

                    combinations.put(destinyCurrency, new HashMap<>());

                }

                combinations.get(destinyCurrency).put(origingCurrency, 1.0 / destinyMapping.get(destinyCurrency));

            }

        }

        Queue<String> currencies = new LinkedList<>();
        currencies.add(origin);

        Queue<Double> ammounts = new LinkedList<>();
        ammounts.add(1.0);

        Set<String> visitedCurrencies = new HashSet<>();

        while (!currencies.isEmpty()) {

            final String currency = currencies.poll();
            final Double ammount = ammounts.poll();

            if (visitedCurrencies.contains(currency)) {

                continue;

            }

            visitedCurrencies.add(currency);

            if (combinations.containsKey(currency)) {

                final Map<String, Double> ratings = combinations.get(currency);

                for (String key : ratings.keySet()) {

                    currencies.add(key);

                    if (key.equals(destiny)) {

                        return ratings.get(key) * ammount;

                    }

                    ammounts.add(ratings.get(key) * ammount);

                }

            }

        }

        return conversionRate;

    }

}
