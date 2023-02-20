#include <stdio.h>
#include <sys/socket.h>

static int socket_fd;

void clean() {
  char message[1] = {2};
  while (write(socket_fd, message, 1) == -1 && errno == EINTR);
}

void increment() {
  char message[1] = {1};
  while (write(socket_fd, message, 1) == -1 && errno == EINTR);
}

int get() {
  char message[1] = {2};
  int result;
  while (write(socket_fd, message, 1) == -1 && errno == EINTR);
  while (read(socket_fd, &result, sizeof result) == -1 && errno == EINTR);
  return ntohl(result);
}

int client_connect() {
  socket_fd = sock(SOCK_STREAM, AF_IP6, 0);
  if (socket_fd == -1) { perror("socket"); return -1; }
  if (connect(socket_fd, ...) == -1) { perror("connect"); return -1; }
  return 0;
}
