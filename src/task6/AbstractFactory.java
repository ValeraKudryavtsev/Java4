package task6;

public class AbstractFactory {
    public static void main(String[] args) {
        CharacterFactory heroFactory = new CreateCharacter().creatingNewCharacter("hero");
        CharacterFactory villainFactory = new CreateCharacter().creatingNewCharacter("villain");

        Hero sm = heroFactory.createNewHero("spider-man");
        Hero h = heroFactory.createNewHero("hulk");

        Villain th = villainFactory.createNewVillain("thanos");
        Villain z = villainFactory.createNewVillain("zemo");

        System.out.println(sm.getName());
        System.out.println(h.getName());

        System.out.println(th.getName());
        System.out.println(z.getName());
    }
}

interface Hero {
    String getName();
}

class SpiderMan implements Hero {
    @Override
    public String getName() {
        return "I'm SpiderMan!";
    }
}

class Hulk implements Hero {
    @Override
    public String getName() {
        return "I'm Hulk!";
    }
}

interface Villain {
    String getName();
}

class Zemo implements Villain {
    @Override
    public String getName() {
        return "I'm Zemo!";
    }
}

class Thanos implements Villain {
    @Override
    public String getName() {
        return "I'm Thanos!";
    }
}

interface CharacterFactory {
    Hero createNewHero(String type);
    Villain createNewVillain(String type);
}

class HeroFactory implements CharacterFactory {
    @Override
    public Hero createNewHero(String type) {
        switch (type) {
            case "spider-man":
                return new SpiderMan();
            case "hulk":
                return new Hulk();
            default:
                return null;
        }
    }

    @Override
    public Villain createNewVillain(String type) {
        return null;
    }
}

class VillainFactory implements CharacterFactory {
    @Override
    public Hero createNewHero(String type) {
        return null;
    }

    @Override
    public Villain createNewVillain(String type) {
        switch (type) {
            case "thanos":
                return new Thanos();
            case "zemo":
                return new Zemo();
            default:
                return null;
        }
    }
}

class CreateCharacter {
    public CharacterFactory creatingNewCharacter(String typeOfCharacter) {
        switch (typeOfCharacter) {
            case "hero":
                return new HeroFactory();
            case "villain":
                return new VillainFactory();
            default:
                return null;
        }
    }
}
