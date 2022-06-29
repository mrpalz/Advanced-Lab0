class SimpleAlgorithmRunner {
    public static void main(String[] args) throws Exception {
        // Create instance of SimpleAlgorithms with a specific array
        int[] data = { 4, 7, 5, 2, 1, 5 };
        SimpleAlgorithms s = new SimpleAlgorithms(data);
        System.out.println("Minimum is: " + s.findMin());
        System.out.println("Maximum is: " + s.findMax());
        System.out.println("Average is: " + s.avg());
        // Swap elements 1 and 5, print it out using helper function
        s.swap(1, 5);
        System.out.println("Sorted List is: ");
        s.sort();
    }
}
