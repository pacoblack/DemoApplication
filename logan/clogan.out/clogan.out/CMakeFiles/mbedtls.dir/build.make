# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.19

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Disable VCS-based implicit rules.
% : %,v


# Disable VCS-based implicit rules.
% : RCS/%


# Disable VCS-based implicit rules.
% : RCS/%,v


# Disable VCS-based implicit rules.
% : SCCS/s.%


# Disable VCS-based implicit rules.
% : s.%


.SUFFIXES: .hpux_make_needs_suffix_list


# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

#Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /usr/local/Cellar/cmake/3.19.7/bin/cmake

# The command to remove a file.
RM = /usr/local/Cellar/cmake/3.19.7/bin/cmake -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /Users/wangtiegang3/projects/github/DemoApplication/logan

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /Users/wangtiegang3/projects/github/DemoApplication/logan

# Include any dependencies generated for this target.
include clogan.out/clogan.out/CMakeFiles/mbedtls.dir/depend.make

# Include the progress variables for this target.
include clogan.out/clogan.out/CMakeFiles/mbedtls.dir/progress.make

# Include the compile flags for this target's objects.
include clogan.out/clogan.out/CMakeFiles/mbedtls.dir/flags.make

clogan.out/clogan.out/CMakeFiles/mbedtls.dir/debug.c.o: clogan.out/clogan.out/CMakeFiles/mbedtls.dir/flags.make
clogan.out/clogan.out/CMakeFiles/mbedtls.dir/debug.c.o: mbedtls/library/debug.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/wangtiegang3/projects/github/DemoApplication/logan/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building C object clogan.out/clogan.out/CMakeFiles/mbedtls.dir/debug.c.o"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/mbedtls.dir/debug.c.o -c /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/debug.c

clogan.out/clogan.out/CMakeFiles/mbedtls.dir/debug.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/mbedtls.dir/debug.c.i"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/debug.c > CMakeFiles/mbedtls.dir/debug.c.i

clogan.out/clogan.out/CMakeFiles/mbedtls.dir/debug.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/mbedtls.dir/debug.c.s"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/debug.c -o CMakeFiles/mbedtls.dir/debug.c.s

clogan.out/clogan.out/CMakeFiles/mbedtls.dir/net_sockets.c.o: clogan.out/clogan.out/CMakeFiles/mbedtls.dir/flags.make
clogan.out/clogan.out/CMakeFiles/mbedtls.dir/net_sockets.c.o: mbedtls/library/net_sockets.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/wangtiegang3/projects/github/DemoApplication/logan/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Building C object clogan.out/clogan.out/CMakeFiles/mbedtls.dir/net_sockets.c.o"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/mbedtls.dir/net_sockets.c.o -c /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/net_sockets.c

clogan.out/clogan.out/CMakeFiles/mbedtls.dir/net_sockets.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/mbedtls.dir/net_sockets.c.i"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/net_sockets.c > CMakeFiles/mbedtls.dir/net_sockets.c.i

clogan.out/clogan.out/CMakeFiles/mbedtls.dir/net_sockets.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/mbedtls.dir/net_sockets.c.s"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/net_sockets.c -o CMakeFiles/mbedtls.dir/net_sockets.c.s

clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_cache.c.o: clogan.out/clogan.out/CMakeFiles/mbedtls.dir/flags.make
clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_cache.c.o: mbedtls/library/ssl_cache.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/wangtiegang3/projects/github/DemoApplication/logan/CMakeFiles --progress-num=$(CMAKE_PROGRESS_3) "Building C object clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_cache.c.o"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/mbedtls.dir/ssl_cache.c.o -c /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/ssl_cache.c

clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_cache.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/mbedtls.dir/ssl_cache.c.i"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/ssl_cache.c > CMakeFiles/mbedtls.dir/ssl_cache.c.i

clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_cache.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/mbedtls.dir/ssl_cache.c.s"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/ssl_cache.c -o CMakeFiles/mbedtls.dir/ssl_cache.c.s

clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_ciphersuites.c.o: clogan.out/clogan.out/CMakeFiles/mbedtls.dir/flags.make
clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_ciphersuites.c.o: mbedtls/library/ssl_ciphersuites.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/wangtiegang3/projects/github/DemoApplication/logan/CMakeFiles --progress-num=$(CMAKE_PROGRESS_4) "Building C object clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_ciphersuites.c.o"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/mbedtls.dir/ssl_ciphersuites.c.o -c /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/ssl_ciphersuites.c

clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_ciphersuites.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/mbedtls.dir/ssl_ciphersuites.c.i"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/ssl_ciphersuites.c > CMakeFiles/mbedtls.dir/ssl_ciphersuites.c.i

clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_ciphersuites.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/mbedtls.dir/ssl_ciphersuites.c.s"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/ssl_ciphersuites.c -o CMakeFiles/mbedtls.dir/ssl_ciphersuites.c.s

clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_cli.c.o: clogan.out/clogan.out/CMakeFiles/mbedtls.dir/flags.make
clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_cli.c.o: mbedtls/library/ssl_cli.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/wangtiegang3/projects/github/DemoApplication/logan/CMakeFiles --progress-num=$(CMAKE_PROGRESS_5) "Building C object clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_cli.c.o"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/mbedtls.dir/ssl_cli.c.o -c /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/ssl_cli.c

clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_cli.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/mbedtls.dir/ssl_cli.c.i"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/ssl_cli.c > CMakeFiles/mbedtls.dir/ssl_cli.c.i

clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_cli.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/mbedtls.dir/ssl_cli.c.s"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/ssl_cli.c -o CMakeFiles/mbedtls.dir/ssl_cli.c.s

clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_cookie.c.o: clogan.out/clogan.out/CMakeFiles/mbedtls.dir/flags.make
clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_cookie.c.o: mbedtls/library/ssl_cookie.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/wangtiegang3/projects/github/DemoApplication/logan/CMakeFiles --progress-num=$(CMAKE_PROGRESS_6) "Building C object clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_cookie.c.o"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/mbedtls.dir/ssl_cookie.c.o -c /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/ssl_cookie.c

clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_cookie.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/mbedtls.dir/ssl_cookie.c.i"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/ssl_cookie.c > CMakeFiles/mbedtls.dir/ssl_cookie.c.i

clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_cookie.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/mbedtls.dir/ssl_cookie.c.s"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/ssl_cookie.c -o CMakeFiles/mbedtls.dir/ssl_cookie.c.s

clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_srv.c.o: clogan.out/clogan.out/CMakeFiles/mbedtls.dir/flags.make
clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_srv.c.o: mbedtls/library/ssl_srv.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/wangtiegang3/projects/github/DemoApplication/logan/CMakeFiles --progress-num=$(CMAKE_PROGRESS_7) "Building C object clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_srv.c.o"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/mbedtls.dir/ssl_srv.c.o -c /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/ssl_srv.c

clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_srv.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/mbedtls.dir/ssl_srv.c.i"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/ssl_srv.c > CMakeFiles/mbedtls.dir/ssl_srv.c.i

clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_srv.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/mbedtls.dir/ssl_srv.c.s"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/ssl_srv.c -o CMakeFiles/mbedtls.dir/ssl_srv.c.s

clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_ticket.c.o: clogan.out/clogan.out/CMakeFiles/mbedtls.dir/flags.make
clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_ticket.c.o: mbedtls/library/ssl_ticket.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/wangtiegang3/projects/github/DemoApplication/logan/CMakeFiles --progress-num=$(CMAKE_PROGRESS_8) "Building C object clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_ticket.c.o"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/mbedtls.dir/ssl_ticket.c.o -c /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/ssl_ticket.c

clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_ticket.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/mbedtls.dir/ssl_ticket.c.i"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/ssl_ticket.c > CMakeFiles/mbedtls.dir/ssl_ticket.c.i

clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_ticket.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/mbedtls.dir/ssl_ticket.c.s"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/ssl_ticket.c -o CMakeFiles/mbedtls.dir/ssl_ticket.c.s

clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_tls.c.o: clogan.out/clogan.out/CMakeFiles/mbedtls.dir/flags.make
clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_tls.c.o: mbedtls/library/ssl_tls.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/wangtiegang3/projects/github/DemoApplication/logan/CMakeFiles --progress-num=$(CMAKE_PROGRESS_9) "Building C object clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_tls.c.o"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/mbedtls.dir/ssl_tls.c.o -c /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/ssl_tls.c

clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_tls.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/mbedtls.dir/ssl_tls.c.i"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/ssl_tls.c > CMakeFiles/mbedtls.dir/ssl_tls.c.i

clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_tls.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/mbedtls.dir/ssl_tls.c.s"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/ssl_tls.c -o CMakeFiles/mbedtls.dir/ssl_tls.c.s

# Object files for target mbedtls
mbedtls_OBJECTS = \
"CMakeFiles/mbedtls.dir/debug.c.o" \
"CMakeFiles/mbedtls.dir/net_sockets.c.o" \
"CMakeFiles/mbedtls.dir/ssl_cache.c.o" \
"CMakeFiles/mbedtls.dir/ssl_ciphersuites.c.o" \
"CMakeFiles/mbedtls.dir/ssl_cli.c.o" \
"CMakeFiles/mbedtls.dir/ssl_cookie.c.o" \
"CMakeFiles/mbedtls.dir/ssl_srv.c.o" \
"CMakeFiles/mbedtls.dir/ssl_ticket.c.o" \
"CMakeFiles/mbedtls.dir/ssl_tls.c.o"

# External object files for target mbedtls
mbedtls_EXTERNAL_OBJECTS =

clogan.out/clogan.out/libmbedtls.a: clogan.out/clogan.out/CMakeFiles/mbedtls.dir/debug.c.o
clogan.out/clogan.out/libmbedtls.a: clogan.out/clogan.out/CMakeFiles/mbedtls.dir/net_sockets.c.o
clogan.out/clogan.out/libmbedtls.a: clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_cache.c.o
clogan.out/clogan.out/libmbedtls.a: clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_ciphersuites.c.o
clogan.out/clogan.out/libmbedtls.a: clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_cli.c.o
clogan.out/clogan.out/libmbedtls.a: clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_cookie.c.o
clogan.out/clogan.out/libmbedtls.a: clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_srv.c.o
clogan.out/clogan.out/libmbedtls.a: clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_ticket.c.o
clogan.out/clogan.out/libmbedtls.a: clogan.out/clogan.out/CMakeFiles/mbedtls.dir/ssl_tls.c.o
clogan.out/clogan.out/libmbedtls.a: clogan.out/clogan.out/CMakeFiles/mbedtls.dir/build.make
clogan.out/clogan.out/libmbedtls.a: clogan.out/clogan.out/CMakeFiles/mbedtls.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/Users/wangtiegang3/projects/github/DemoApplication/logan/CMakeFiles --progress-num=$(CMAKE_PROGRESS_10) "Linking C static library libmbedtls.a"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && $(CMAKE_COMMAND) -P CMakeFiles/mbedtls.dir/cmake_clean_target.cmake
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && $(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/mbedtls.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
clogan.out/clogan.out/CMakeFiles/mbedtls.dir/build: clogan.out/clogan.out/libmbedtls.a

.PHONY : clogan.out/clogan.out/CMakeFiles/mbedtls.dir/build

clogan.out/clogan.out/CMakeFiles/mbedtls.dir/clean:
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && $(CMAKE_COMMAND) -P CMakeFiles/mbedtls.dir/cmake_clean.cmake
.PHONY : clogan.out/clogan.out/CMakeFiles/mbedtls.dir/clean

clogan.out/clogan.out/CMakeFiles/mbedtls.dir/depend:
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/wangtiegang3/projects/github/DemoApplication/logan /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library /Users/wangtiegang3/projects/github/DemoApplication/logan /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out/CMakeFiles/mbedtls.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : clogan.out/clogan.out/CMakeFiles/mbedtls.dir/depend

