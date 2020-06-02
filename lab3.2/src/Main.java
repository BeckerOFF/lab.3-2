/**
 *
 <ol><li>класс Main використовуєтся як точка входу,тобто вказує з якого місця починается виконання програми</li></ol>
 */
public class Main {

    public static void main(String[] args) {
        Vector vector1=new Vector(30,25,18,34,68,54);
        Vector vector2=new Vector (10,5,9,17,17,27);
        Vector result1=vector1.add(vector2);
        Vector result2=vector1.multiply(vector2);
        Vector result3=vector1.deduct(vector2);
        Vector result4=vector1.divide(vector2);
        result1.print();
        result2.print();
        result3.print();
        result4.print();
    }
    }

/**
 *класс Vector використовуєтся для створення та роботи з масивами розмір яких буде заданий користувачем
 */
    class Vector {
        private int dimension;
        private int arr[];

        /**
         *метод Vector(int dimension) використовуєтся для вказання розмірності вектора
         * @param dimension розмірність вектора
         */
        public Vector(int dimension){
            this.dimension=dimension;
            arr=new int[dimension];
        }

        /**
         *метод Vector(int... array) використовуєтся для заповнення вектора числами
         * @param array значення нового масиву
         */
        public Vector(int... array) {
            this(array.length);

            for (int i = 0; i < dimension; i++) {
                this.arr[i] = array[i];
            }
        }

        /**
         *метод getElem(int index) використовуєтся для отримання елемента з вектора
         * @param index індекс необхідного елементу в масиві
         * @return повертнення необхідного елементу
         */
        public int getElem(int index){
            return this.arr[index];
        }

        /**
         *метод setElem(int index, int value) використовуєтся для встановлення значення елементу з вектора по індексу
         * @param index індекс елементу який ми збираємось змінити
         * @param value значення на яке ми змінюємо елемент з заданим індексом
         */
        public void setElem(int index, int value){
            this.arr[index]=value;
        }

        /**
         *метод Vector add(Vector second) використовуєтся для операції додавання між двома векторами
         * @param second другий вектор
         * @return новий вектор який утворився від додавання двох векторів
         */
        public Vector add(Vector second){
            Vector result=new Vector(dimension);
            for (int i = 0; i < dimension; i++) {
                result.arr[i] = this.arr[i] + second.arr[i];
            }
            return result;

        }

        /**
         *метод Vector multiply(Vector second) використовуєтся для операції множення між двома векторами
         * @param second другий вектор
         * @return новий вектор який утворився від множення двох векторів
         */
        public Vector multiply(Vector second){
            Vector result=new Vector(dimension);
            for (int i = 0; i < dimension; i++) {
                result.arr[i] = this.arr[i] * second.arr[i];
            }
            return result;
        }

        /**
         *метод Vector deduct(Vector second) використовуєтся для операції віднімання між двома векторами
         * @param second другий вектор
         * @return новий вектор який утворився від віднімання двох векторів
         */
        public Vector deduct(Vector second){
            Vector result=new Vector(dimension);
            for (int i = 0; i < dimension; i++) {
                result.arr[i] = this.arr[i] - second.arr[i];
            }
            return result;
        }
    /**
     *
     метод Vector deduct(Vector second) використовуєтся для операції ділення між двома векторами
     * @param second другий вектор
     * @return новий вектор який утворився від ділення двох векторів
     */
    public Vector divide(Vector second){
        Vector result=new Vector(dimension);
        for (int i = 0; i < dimension; i++) {
            result.arr[i] = this.arr[i] / second.arr[i];
        }
        return result;
    }

        /**
         *метод String toString() приводить результат в стрічковий вигляд
         * @return string value of vector
         */
        public String toString() {
            StringBuilder string = new StringBuilder();

            for (int i = 0; i < this.dimension; i++) {
                if (i==0){
                    string.append("[" +this.arr[i]+", ");
                }
                else if (i != dimension - 1) {
                    string.append(this.arr[i] + ", ");
                }
                else {
                    string.append( this.arr[i]+"]");
                }
            }
            return string.toString();
        }

    /**
     *метод print() виводить в консоль результати роботи програми
     */
        public void print() {
            System.out.println("Result: " +this.toString());
        }
    }