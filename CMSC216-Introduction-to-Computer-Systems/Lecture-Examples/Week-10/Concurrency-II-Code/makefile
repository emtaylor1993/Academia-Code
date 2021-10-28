CC = gcc
CFLAGS = -ansi -Wall -g -O0 -Wwrite-strings -Wshadow -pedantic-errors -fstack-protector-all 
LDFLAGS = -lpthread
PROGS = threadsNoSem threadsSem pthreadsSync pthreadsSync2 race raceFixed

all: $(PROGS)

clean:
	@echo "Cleaning executables and .o files"
	@rm -f *.o $(PROGS) a.out
