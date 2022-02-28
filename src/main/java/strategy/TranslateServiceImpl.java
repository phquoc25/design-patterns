package strategy;

public class TranslateServiceImpl implements TranslateService {

    @Override
    public String sayHello(String language) {
        switch (language) {
            case "es":
                return "Hola!";
            case "ja":
                return "Kon'nichiwa";
            case "en":
                return "Hello";
            default:
                return "";
        }
    }
}
