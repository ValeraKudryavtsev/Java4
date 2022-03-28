package task8;

public class StrategyTest {
    /*
    Определяет ряд алгоритмов позволяя взаимодействовать между ними.
    Алгоритм стратегии может быть изменен во время выполнения программы.
    */

    public static void main(String[] args) {
        Context context = new Context(new DownloadMacStrategy());
        context.download("file.txt");
        context = new Context(new DownloadLinuxStrategy());
        context.download("file.txt");
    }
}

interface Strategy {
    void download(String file);
}

class DownloadMacStrategy implements Strategy {
    public void download(String file) {
        System.out.println("mac download: " + file);
    }
}

class DownloadLinuxStrategy implements Strategy {
    public void download(String file) {
        System.out.println("linux download: " + file);
    }
}

class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void download(String file){
        strategy.download(file);
    }
}
