class Rotation 
{
    void Rotate(int arr[], int d, int n)
	{
        for (int i = 0; i < d; i++)
            RotateArray(arr, n);
    }

    void RotateArray(int arr[], int n)
	{
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }
}
class Teckalphatask3
{
    public static void main(String[] args)
	{

        Rotation rotate = new Rotation();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int d = 2;

        rotate.Rotate(arr, d, n);

        for (int i = 0; i < n; i++)
		{
            System.out.print(arr[i] + " ");
		}
    }
}