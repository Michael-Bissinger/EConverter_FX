package ecommerce.converter;

public class ConvertMain {

    public static void start (String platform) {

        System.out.println("Plattform: " + platform);


        switch (platform) {
            case "Alltricks":

            case "Amazon":
                DataRecorder.loadData(platform);
                DataParser.parseData();
                break;
            case "Carrefour":
                break;
            case "Conrad":
                break;
            case "Crowdfox":

            case "eBay":
                break;
            case "Manomano":

            case "MediaMarkt":

            case "Mercateo":

            case "Metro":

            case "Mivo":

            case "Otto":

            case "Real":

            case "Rakuten":

            case "Saturn":

            case "Völkner":

            default:
                System.out.println("Plattform ist nicht verfügbar");
                break;
        }


        System.out.println("Konvertierung fertig!");


    }

}
