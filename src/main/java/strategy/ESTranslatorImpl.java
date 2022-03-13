package strategy;

public class ESTranslatorImpl implements TranslateStrategy {
    @Override
    public String sayHello() {
        return "Hola";
    }

    @Override
    public boolean support(String language) {
        return "es".equals(language);
    }
}
