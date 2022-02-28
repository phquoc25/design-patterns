package strategy;

public class FRTranslatorImpl implements TranslateStrategy {
    @Override
    public String sayHello() {
        return "Bonjour";
    }

    @Override
    public boolean support(String language) {
        return "fr".equals(language);
    }
}
