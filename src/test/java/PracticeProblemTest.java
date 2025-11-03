import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
public class PracticeProblemTest {
@Test
@DisplayName("")
void insertionSortTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {double[].class};
        Method method = testClass.getDeclaredMethod("insertionSort", cArg);
  // Enter code here
  double arr[] = {155.2, 155.1, 1, 5, 3, 2, 7};
  double arr2[] = {1, 2, 3, 5, 7, 155.1, 155.2};
    method.invoke(null, arr);
  assertArrayEquals(arr2, arr, 0.1);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void insertionSortTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {double[].class};
        Method method = testClass.getDeclaredMethod("insertionSort", cArg);
  // Enter code here
  double arr[] = {155.2, 155.1, 1, 5, 3, 2, 7};
  int[] result = (int[])method.invoke(null, arr);
  int[] expected = new int[]{26,14};
  assertArrayEquals(expected, result);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void selectionSortTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {double[].class};
        Method method = testClass.getDeclaredMethod("selectionSort", cArg);
  // Enter code here
  double arr[] = {155.2, 155.1, 1, 5, 3, 2, 7, 8};
  double arr2[] = {1, 2, 3, 5, 7, 8, 155.1, 155.2};
    method.invoke(null, arr);
  assertArrayEquals(arr2, arr, 0.1);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void selectionSortTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {double[].class};
        Method method = testClass.getDeclaredMethod("selectionSort", cArg);
  // Enter code here
  double arr[] = {155.2, 155.1, 1, 5, 3, 2, 7, 8};
  int[] result = (int[])method.invoke(null, arr);
  int[] expected = new int[]{32, 28};
  assertArrayEquals(expected, result);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void bubbleSortTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {double[].class};
        Method method = testClass.getDeclaredMethod("bubbleSort", cArg);
  // Enter code here
  double arr[] = {155.2, 155.1, 1, 5, 3, 2, 7, 235};
  int[] result = (int[])method.invoke(null, arr);
  int[] expected = new int[]{42,25};
  assertArrayEquals(expected, result);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void leastSwapsTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {double[].class};
        Method method = testClass.getDeclaredMethod("leastSwaps", cArg);
  // Enter code here
  double arr[] = {155.2, 155.1, 1, 5, 3, 2, 7};
    String result = (String)method.invoke(null, arr);
  assertEquals("Insertion", result);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void leastSwapsTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {double[].class};
        Method method = testClass.getDeclaredMethod("leastSwaps", cArg);
  // Enter code here
  double arr[] = {1, 2, 3, 4, 5, 6};
    String result = (String)method.invoke(null, arr);
  assertEquals("Bubble", result);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void leastSwapsTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {double[].class};
        Method method = testClass.getDeclaredMethod("leastSwaps", cArg);
  // Enter code here
  double arr[] = {155.2, 155.1, 1, 5, 3, 2, 7};
    String result = (String)method.invoke(null, arr);
  assertEquals("Insertion", result);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void leastSwapsTest4() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {double[].class};
        Method method = testClass.getDeclaredMethod("leastSwaps", cArg);
  // Enter code here
  double arr[] = {9, 7, 4, 2, 1, 0};
    String result = (String)method.invoke(null, arr);
  assertEquals("Selection", result);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void leastStepsTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {double[].class};
        Method method = testClass.getDeclaredMethod("leastIterations", cArg);
  // Enter code here
  double arr[] = {155.2, 155.1, 1, 5, 3, 2, 7};
    String result = (String)method.invoke(null, arr);
  assertEquals("Insertion", result);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void leastStepsTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {double[].class};
        Method method = testClass.getDeclaredMethod("leastIterations", cArg);
  // Enter code here
  double arr[] = {1, 2, 3, 4, 5, 6};
    String result = (String)method.invoke(null, arr);
  assertEquals("Insertion", result);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void leastStepsTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {double[].class};
        Method method = testClass.getDeclaredMethod("leastIterations", cArg);
  // Enter code here
  double arr[] = {155.2, 155.1, 1, 5, 3, 2, 7};
    String result = (String)method.invoke(null, arr);
  assertEquals("Insertion", result);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void leastStepsTest4() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {double[].class};
        Method method = testClass.getDeclaredMethod("leastIterations", cArg);
  // Enter code here
  double arr[] = {9, 7, 4, 2, 1, 0};
    String result = (String)method.invoke(null, arr);
  assertEquals("Bubble", result);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void bubbleSortTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {double[].class};
        Method method = testClass.getDeclaredMethod("bubbleSort", cArg);
  // Enter code here
  double arr[] = {155.2, 155.1, 1, 5, 3, 2, 7, 235};
  double arr2[] = {1, 2, 3, 5, 7, 155.1, 155.2, 235};
    method.invoke(null, arr);
  assertArrayEquals(arr2, arr, 0.1);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
}
