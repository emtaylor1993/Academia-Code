CC = gcc
CFLAGS =  -ansi -Wall -g -O0 -Wwrite-strings -Wshadow -pedantic-errors -fstack-protector-all

LIBRARY_TO_CREATE = libMyArchive.a
OBJS = first.o second.o

main_run: main.o $(LIBRARY_TO_CREATE)
	$(CC) -o main_run main.o $(LIBRARY_TO_CREATE)

$(LIBRARY_TO_CREATE): $(OBJS)
	ar cru $(LIBRARY_TO_CREATE) $(OBJS)


clean:
	rm $(OBJS) main.o main_run $(LIBRARY_TO_CREATE)
