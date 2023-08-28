package cbs.dp.ua.Reflection_5_3;

    public final class SomeClass {

        private String word = "JustWord";
        protected int age = 7;
        char chr = '5';

        public SomeClass() {

        }

        public SomeClass(String word, int age) {
            this.word = word;
            this.age = age;
        }

        public SomeClass(String word, int age, char chr) {
            this.word = word;
            this.age = age;
            this.chr = chr;
        }

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public char getChr() {
            return chr;
        }

        public void setChr(char chr) {
            this.chr = chr;
        }
    }

