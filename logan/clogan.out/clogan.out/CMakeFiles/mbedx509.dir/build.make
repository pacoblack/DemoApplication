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
include clogan.out/clogan.out/CMakeFiles/mbedx509.dir/depend.make

# Include the progress variables for this target.
include clogan.out/clogan.out/CMakeFiles/mbedx509.dir/progress.make

# Include the compile flags for this target's objects.
include clogan.out/clogan.out/CMakeFiles/mbedx509.dir/flags.make

clogan.out/clogan.out/CMakeFiles/mbedx509.dir/certs.c.o: clogan.out/clogan.out/CMakeFiles/mbedx509.dir/flags.make
clogan.out/clogan.out/CMakeFiles/mbedx509.dir/certs.c.o: mbedtls/library/certs.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/wangtiegang3/projects/github/DemoApplication/logan/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building C object clogan.out/clogan.out/CMakeFiles/mbedx509.dir/certs.c.o"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/mbedx509.dir/certs.c.o -c /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/certs.c

clogan.out/clogan.out/CMakeFiles/mbedx509.dir/certs.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/mbedx509.dir/certs.c.i"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/certs.c > CMakeFiles/mbedx509.dir/certs.c.i

clogan.out/clogan.out/CMakeFiles/mbedx509.dir/certs.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/mbedx509.dir/certs.c.s"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/certs.c -o CMakeFiles/mbedx509.dir/certs.c.s

clogan.out/clogan.out/CMakeFiles/mbedx509.dir/pkcs11.c.o: clogan.out/clogan.out/CMakeFiles/mbedx509.dir/flags.make
clogan.out/clogan.out/CMakeFiles/mbedx509.dir/pkcs11.c.o: mbedtls/library/pkcs11.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/wangtiegang3/projects/github/DemoApplication/logan/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Building C object clogan.out/clogan.out/CMakeFiles/mbedx509.dir/pkcs11.c.o"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/mbedx509.dir/pkcs11.c.o -c /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/pkcs11.c

clogan.out/clogan.out/CMakeFiles/mbedx509.dir/pkcs11.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/mbedx509.dir/pkcs11.c.i"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/pkcs11.c > CMakeFiles/mbedx509.dir/pkcs11.c.i

clogan.out/clogan.out/CMakeFiles/mbedx509.dir/pkcs11.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/mbedx509.dir/pkcs11.c.s"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/pkcs11.c -o CMakeFiles/mbedx509.dir/pkcs11.c.s

clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509.c.o: clogan.out/clogan.out/CMakeFiles/mbedx509.dir/flags.make
clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509.c.o: mbedtls/library/x509.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/wangtiegang3/projects/github/DemoApplication/logan/CMakeFiles --progress-num=$(CMAKE_PROGRESS_3) "Building C object clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509.c.o"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/mbedx509.dir/x509.c.o -c /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/x509.c

clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/mbedx509.dir/x509.c.i"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/x509.c > CMakeFiles/mbedx509.dir/x509.c.i

clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/mbedx509.dir/x509.c.s"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/x509.c -o CMakeFiles/mbedx509.dir/x509.c.s

clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509_create.c.o: clogan.out/clogan.out/CMakeFiles/mbedx509.dir/flags.make
clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509_create.c.o: mbedtls/library/x509_create.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/wangtiegang3/projects/github/DemoApplication/logan/CMakeFiles --progress-num=$(CMAKE_PROGRESS_4) "Building C object clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509_create.c.o"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/mbedx509.dir/x509_create.c.o -c /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/x509_create.c

clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509_create.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/mbedx509.dir/x509_create.c.i"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/x509_create.c > CMakeFiles/mbedx509.dir/x509_create.c.i

clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509_create.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/mbedx509.dir/x509_create.c.s"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/x509_create.c -o CMakeFiles/mbedx509.dir/x509_create.c.s

clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509_crl.c.o: clogan.out/clogan.out/CMakeFiles/mbedx509.dir/flags.make
clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509_crl.c.o: mbedtls/library/x509_crl.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/wangtiegang3/projects/github/DemoApplication/logan/CMakeFiles --progress-num=$(CMAKE_PROGRESS_5) "Building C object clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509_crl.c.o"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/mbedx509.dir/x509_crl.c.o -c /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/x509_crl.c

clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509_crl.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/mbedx509.dir/x509_crl.c.i"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/x509_crl.c > CMakeFiles/mbedx509.dir/x509_crl.c.i

clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509_crl.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/mbedx509.dir/x509_crl.c.s"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/x509_crl.c -o CMakeFiles/mbedx509.dir/x509_crl.c.s

clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509_crt.c.o: clogan.out/clogan.out/CMakeFiles/mbedx509.dir/flags.make
clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509_crt.c.o: mbedtls/library/x509_crt.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/wangtiegang3/projects/github/DemoApplication/logan/CMakeFiles --progress-num=$(CMAKE_PROGRESS_6) "Building C object clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509_crt.c.o"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/mbedx509.dir/x509_crt.c.o -c /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/x509_crt.c

clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509_crt.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/mbedx509.dir/x509_crt.c.i"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/x509_crt.c > CMakeFiles/mbedx509.dir/x509_crt.c.i

clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509_crt.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/mbedx509.dir/x509_crt.c.s"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/x509_crt.c -o CMakeFiles/mbedx509.dir/x509_crt.c.s

clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509_csr.c.o: clogan.out/clogan.out/CMakeFiles/mbedx509.dir/flags.make
clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509_csr.c.o: mbedtls/library/x509_csr.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/wangtiegang3/projects/github/DemoApplication/logan/CMakeFiles --progress-num=$(CMAKE_PROGRESS_7) "Building C object clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509_csr.c.o"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/mbedx509.dir/x509_csr.c.o -c /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/x509_csr.c

clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509_csr.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/mbedx509.dir/x509_csr.c.i"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/x509_csr.c > CMakeFiles/mbedx509.dir/x509_csr.c.i

clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509_csr.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/mbedx509.dir/x509_csr.c.s"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/x509_csr.c -o CMakeFiles/mbedx509.dir/x509_csr.c.s

clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509write_crt.c.o: clogan.out/clogan.out/CMakeFiles/mbedx509.dir/flags.make
clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509write_crt.c.o: mbedtls/library/x509write_crt.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/wangtiegang3/projects/github/DemoApplication/logan/CMakeFiles --progress-num=$(CMAKE_PROGRESS_8) "Building C object clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509write_crt.c.o"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/mbedx509.dir/x509write_crt.c.o -c /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/x509write_crt.c

clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509write_crt.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/mbedx509.dir/x509write_crt.c.i"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/x509write_crt.c > CMakeFiles/mbedx509.dir/x509write_crt.c.i

clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509write_crt.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/mbedx509.dir/x509write_crt.c.s"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/x509write_crt.c -o CMakeFiles/mbedx509.dir/x509write_crt.c.s

clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509write_csr.c.o: clogan.out/clogan.out/CMakeFiles/mbedx509.dir/flags.make
clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509write_csr.c.o: mbedtls/library/x509write_csr.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/wangtiegang3/projects/github/DemoApplication/logan/CMakeFiles --progress-num=$(CMAKE_PROGRESS_9) "Building C object clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509write_csr.c.o"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/mbedx509.dir/x509write_csr.c.o -c /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/x509write_csr.c

clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509write_csr.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/mbedx509.dir/x509write_csr.c.i"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/x509write_csr.c > CMakeFiles/mbedx509.dir/x509write_csr.c.i

clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509write_csr.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/mbedx509.dir/x509write_csr.c.s"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library/x509write_csr.c -o CMakeFiles/mbedx509.dir/x509write_csr.c.s

# Object files for target mbedx509
mbedx509_OBJECTS = \
"CMakeFiles/mbedx509.dir/certs.c.o" \
"CMakeFiles/mbedx509.dir/pkcs11.c.o" \
"CMakeFiles/mbedx509.dir/x509.c.o" \
"CMakeFiles/mbedx509.dir/x509_create.c.o" \
"CMakeFiles/mbedx509.dir/x509_crl.c.o" \
"CMakeFiles/mbedx509.dir/x509_crt.c.o" \
"CMakeFiles/mbedx509.dir/x509_csr.c.o" \
"CMakeFiles/mbedx509.dir/x509write_crt.c.o" \
"CMakeFiles/mbedx509.dir/x509write_csr.c.o"

# External object files for target mbedx509
mbedx509_EXTERNAL_OBJECTS =

clogan.out/clogan.out/libmbedx509.a: clogan.out/clogan.out/CMakeFiles/mbedx509.dir/certs.c.o
clogan.out/clogan.out/libmbedx509.a: clogan.out/clogan.out/CMakeFiles/mbedx509.dir/pkcs11.c.o
clogan.out/clogan.out/libmbedx509.a: clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509.c.o
clogan.out/clogan.out/libmbedx509.a: clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509_create.c.o
clogan.out/clogan.out/libmbedx509.a: clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509_crl.c.o
clogan.out/clogan.out/libmbedx509.a: clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509_crt.c.o
clogan.out/clogan.out/libmbedx509.a: clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509_csr.c.o
clogan.out/clogan.out/libmbedx509.a: clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509write_crt.c.o
clogan.out/clogan.out/libmbedx509.a: clogan.out/clogan.out/CMakeFiles/mbedx509.dir/x509write_csr.c.o
clogan.out/clogan.out/libmbedx509.a: clogan.out/clogan.out/CMakeFiles/mbedx509.dir/build.make
clogan.out/clogan.out/libmbedx509.a: clogan.out/clogan.out/CMakeFiles/mbedx509.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/Users/wangtiegang3/projects/github/DemoApplication/logan/CMakeFiles --progress-num=$(CMAKE_PROGRESS_10) "Linking C static library libmbedx509.a"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && $(CMAKE_COMMAND) -P CMakeFiles/mbedx509.dir/cmake_clean_target.cmake
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && $(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/mbedx509.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
clogan.out/clogan.out/CMakeFiles/mbedx509.dir/build: clogan.out/clogan.out/libmbedx509.a

.PHONY : clogan.out/clogan.out/CMakeFiles/mbedx509.dir/build

clogan.out/clogan.out/CMakeFiles/mbedx509.dir/clean:
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out && $(CMAKE_COMMAND) -P CMakeFiles/mbedx509.dir/cmake_clean.cmake
.PHONY : clogan.out/clogan.out/CMakeFiles/mbedx509.dir/clean

clogan.out/clogan.out/CMakeFiles/mbedx509.dir/depend:
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/wangtiegang3/projects/github/DemoApplication/logan /Users/wangtiegang3/projects/github/DemoApplication/logan/mbedtls/library /Users/wangtiegang3/projects/github/DemoApplication/logan /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/clogan.out/CMakeFiles/mbedx509.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : clogan.out/clogan.out/CMakeFiles/mbedx509.dir/depend

