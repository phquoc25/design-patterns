package strategy;

public class VNTranslatorImpl implements TranslateStrategy {
    @Override
    public String sayHello() {
        return "Xin chao";
    }

    @Override
    public boolean support(String language) {
        return "vn".equals(language);
    }
}
