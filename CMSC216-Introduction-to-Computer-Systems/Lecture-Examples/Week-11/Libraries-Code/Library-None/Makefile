CC = gcc
CFLAGS = -ansi -Wall -g -O0 -Wwrite-strings -Wshadow -pedantic-errors -fstack-protector-all 

main_run: first.o second.o main.o
	$(CC) -o main_run first.o second.o main.o

clean:
	rm *.o main_run
