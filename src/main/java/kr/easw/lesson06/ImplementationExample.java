package kr.easw.lesson06;

/**
 * 해당 클래스는 인터페이스에 대해 조금 더 친숙해지기 위해 구성된 문제입니다.
 *
 * Dog 클래스를 참고하여, Cat과 Horse 클래스를 Animal 인터페이스를 구현하도록 만들어보세요.
 * 해당 예제는 의도적으로 오류가 발생하도록 구성되었으며, Animal을 구현하지 않은 클래스는 오류가 발생합니다.
 */
public class ImplementationExample {

    public static void main(String[] args) {
        new Dog().speak();
        new Cat().speak();
        new Horse().speak();
    }

    // 인터페이스는 클래스의 설계도와 비슷한 개념입니다.
    // 메서드를 강제할 수 있으나 변수와 같은 실질적인 데이터는 가질 수 없습니다.
    // 또한, 설계도에 가까운 개념이기에 실체가 있는 인스턴스를 생성할 수 없습니다.
    // 자바 7까지는 인터페이스에서 몸체(body)가 있는 메서드를 사용할 수 없었으나, 자바 8부터는 default 키워드를 사용하여 몸체가 있는 메서드를 사용할 수 있습니다.
    // 이번 예제에서는 default 키워드를 실습하지 않습니다.
    interface Animal {
        void speak();
    }

    final static class Dog implements Animal {
        private void bark() {
            System.out.println("Bark!");
        }

        @Override
        public void speak() {
            bark();
        }
    }

    static class Cat implements Animal {
        private void meow() {
            System.out.println("Meow!");
        }

        @Override
        public void speak() {
            meow();
        }
    }

    static class Horse implements Animal {
        private void neigh() {
            System.out.println("Neigh!");
        }

        @Override
        public void speak() {
            neigh();
        }
    }
}
