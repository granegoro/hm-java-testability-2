public class BmiService {
        public int calculate(int height, int weight) {
            int result;
            height = (height * height);
            result = (weight / height);
            return result;
        }
}
