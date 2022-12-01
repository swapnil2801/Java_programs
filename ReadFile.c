#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>
#include<io.h>    // OR
#include<conio.h>   // OR
//#include<unistd.h>

int main()
{
    char Fname[20];
    int fd = 0;
    char Data[20];

    printf("Please enter file name that you want to open\n");
    scanf("%s",Fname);

    fd = open(Fname,O_RDWR);    // O_RDONLY     O_WRONLY     O_RDWR
    if(fd == -1)
    {
        printf("Unable to open the file\n");
        return -1;
    }
    else
    {
        printf("File is succesfully open with FD %d\n",fd);
    }

    read(fd,Data,10);
    printf("Data from file is : %s\n",Data);

    close(fd);

    return 0;
}