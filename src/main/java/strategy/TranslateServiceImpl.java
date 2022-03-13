package strategy;

import java.util.List;

public class TranslateServiceImpl implements TranslateService {
    private final List<TranslateStrategy> translateStrategyList;

    public TranslateServiceImpl(List<TranslateStrategy> translateStrategyList) {
        this.translateStrategyList = translateStrategyList;
    }

    @Override
    public String sayHello(String language) {
        return translateStrategyList.stream()
                .filter(translateStrategy -> translateStrategy.support(language))
                .findFirst()
                .map(TranslateStrategy::sayHello)
                .orElse("I don't know");
    }
}
