CC = gcc
CFLAGS =  -ansi -Wall -g -O0 -Wwrite-strings -Wshadow -pedantic-errors \
	-fstack-protector-all -fPIC -I../LibraryShared1 

main_run: main.o
	$(CC) -o main_run main.o -L../LibraryShared1 -lMySharedLib

clean: 
	rm -f *.o main_run
