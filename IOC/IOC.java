// package IOC;

// public class IOC {
//     public void start() {
//         System.out.println("Engine Started");
//     }
// }

// class Car {
//     private IOC engine;

//     // constructor injection
//     public Car(IOC engine) {
//         this.engine = engine;
//     }

//     public void drive() {
//         engine.start();
//         System.out.println("Car is driving");
//     }
// }

// // configuration using java annotations
// @Configuration
// class AppConfig {
//     @Bean
//     public IOC engine() {
//         return new IOC();
//     }

//     @Bean
//     public Car car() {
//         return new Car(engine());
//     }
// }

// // Running the Spring Application
// public class SpringIoCExample {
//     public static void main(String[] args) {
//         ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//         Car car = context.getBean(Car.class);
//         car.drive();
//     }
// }