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
include clogan.out/CMakeFiles/clogan.dir/depend.make

# Include the progress variables for this target.
include clogan.out/CMakeFiles/clogan.dir/progress.make

# Include the compile flags for this target's objects.
include clogan.out/CMakeFiles/clogan.dir/flags.make

clogan.out/CMakeFiles/clogan.dir/clogan_core.c.o: clogan.out/CMakeFiles/clogan.dir/flags.make
clogan.out/CMakeFiles/clogan.dir/clogan_core.c.o: Clogan/clogan_core.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/wangtiegang3/projects/github/DemoApplication/logan/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building C object clogan.out/CMakeFiles/clogan.dir/clogan_core.c.o"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/clogan.dir/clogan_core.c.o -c /Users/wangtiegang3/projects/github/DemoApplication/logan/Clogan/clogan_core.c

clogan.out/CMakeFiles/clogan.dir/clogan_core.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/clogan.dir/clogan_core.c.i"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/wangtiegang3/projects/github/DemoApplication/logan/Clogan/clogan_core.c > CMakeFiles/clogan.dir/clogan_core.c.i

clogan.out/CMakeFiles/clogan.dir/clogan_core.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/clogan.dir/clogan_core.c.s"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/wangtiegang3/projects/github/DemoApplication/logan/Clogan/clogan_core.c -o CMakeFiles/clogan.dir/clogan_core.c.s

clogan.out/CMakeFiles/clogan.dir/mmap_util.c.o: clogan.out/CMakeFiles/clogan.dir/flags.make
clogan.out/CMakeFiles/clogan.dir/mmap_util.c.o: Clogan/mmap_util.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/wangtiegang3/projects/github/DemoApplication/logan/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Building C object clogan.out/CMakeFiles/clogan.dir/mmap_util.c.o"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/clogan.dir/mmap_util.c.o -c /Users/wangtiegang3/projects/github/DemoApplication/logan/Clogan/mmap_util.c

clogan.out/CMakeFiles/clogan.dir/mmap_util.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/clogan.dir/mmap_util.c.i"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/wangtiegang3/projects/github/DemoApplication/logan/Clogan/mmap_util.c > CMakeFiles/clogan.dir/mmap_util.c.i

clogan.out/CMakeFiles/clogan.dir/mmap_util.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/clogan.dir/mmap_util.c.s"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/wangtiegang3/projects/github/DemoApplication/logan/Clogan/mmap_util.c -o CMakeFiles/clogan.dir/mmap_util.c.s

clogan.out/CMakeFiles/clogan.dir/cJSON.c.o: clogan.out/CMakeFiles/clogan.dir/flags.make
clogan.out/CMakeFiles/clogan.dir/cJSON.c.o: Clogan/cJSON.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/wangtiegang3/projects/github/DemoApplication/logan/CMakeFiles --progress-num=$(CMAKE_PROGRESS_3) "Building C object clogan.out/CMakeFiles/clogan.dir/cJSON.c.o"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/clogan.dir/cJSON.c.o -c /Users/wangtiegang3/projects/github/DemoApplication/logan/Clogan/cJSON.c

clogan.out/CMakeFiles/clogan.dir/cJSON.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/clogan.dir/cJSON.c.i"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/wangtiegang3/projects/github/DemoApplication/logan/Clogan/cJSON.c > CMakeFiles/clogan.dir/cJSON.c.i

clogan.out/CMakeFiles/clogan.dir/cJSON.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/clogan.dir/cJSON.c.s"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/wangtiegang3/projects/github/DemoApplication/logan/Clogan/cJSON.c -o CMakeFiles/clogan.dir/cJSON.c.s

clogan.out/CMakeFiles/clogan.dir/construct_data.c.o: clogan.out/CMakeFiles/clogan.dir/flags.make
clogan.out/CMakeFiles/clogan.dir/construct_data.c.o: Clogan/construct_data.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/wangtiegang3/projects/github/DemoApplication/logan/CMakeFiles --progress-num=$(CMAKE_PROGRESS_4) "Building C object clogan.out/CMakeFiles/clogan.dir/construct_data.c.o"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/clogan.dir/construct_data.c.o -c /Users/wangtiegang3/projects/github/DemoApplication/logan/Clogan/construct_data.c

clogan.out/CMakeFiles/clogan.dir/construct_data.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/clogan.dir/construct_data.c.i"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/wangtiegang3/projects/github/DemoApplication/logan/Clogan/construct_data.c > CMakeFiles/clogan.dir/construct_data.c.i

clogan.out/CMakeFiles/clogan.dir/construct_data.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/clogan.dir/construct_data.c.s"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/wangtiegang3/projects/github/DemoApplication/logan/Clogan/construct_data.c -o CMakeFiles/clogan.dir/construct_data.c.s

clogan.out/CMakeFiles/clogan.dir/zlib_util.c.o: clogan.out/CMakeFiles/clogan.dir/flags.make
clogan.out/CMakeFiles/clogan.dir/zlib_util.c.o: Clogan/zlib_util.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/wangtiegang3/projects/github/DemoApplication/logan/CMakeFiles --progress-num=$(CMAKE_PROGRESS_5) "Building C object clogan.out/CMakeFiles/clogan.dir/zlib_util.c.o"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/clogan.dir/zlib_util.c.o -c /Users/wangtiegang3/projects/github/DemoApplication/logan/Clogan/zlib_util.c

clogan.out/CMakeFiles/clogan.dir/zlib_util.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/clogan.dir/zlib_util.c.i"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/wangtiegang3/projects/github/DemoApplication/logan/Clogan/zlib_util.c > CMakeFiles/clogan.dir/zlib_util.c.i

clogan.out/CMakeFiles/clogan.dir/zlib_util.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/clogan.dir/zlib_util.c.s"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/wangtiegang3/projects/github/DemoApplication/logan/Clogan/zlib_util.c -o CMakeFiles/clogan.dir/zlib_util.c.s

clogan.out/CMakeFiles/clogan.dir/json_util.c.o: clogan.out/CMakeFiles/clogan.dir/flags.make
clogan.out/CMakeFiles/clogan.dir/json_util.c.o: Clogan/json_util.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/wangtiegang3/projects/github/DemoApplication/logan/CMakeFiles --progress-num=$(CMAKE_PROGRESS_6) "Building C object clogan.out/CMakeFiles/clogan.dir/json_util.c.o"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/clogan.dir/json_util.c.o -c /Users/wangtiegang3/projects/github/DemoApplication/logan/Clogan/json_util.c

clogan.out/CMakeFiles/clogan.dir/json_util.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/clogan.dir/json_util.c.i"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/wangtiegang3/projects/github/DemoApplication/logan/Clogan/json_util.c > CMakeFiles/clogan.dir/json_util.c.i

clogan.out/CMakeFiles/clogan.dir/json_util.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/clogan.dir/json_util.c.s"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/wangtiegang3/projects/github/DemoApplication/logan/Clogan/json_util.c -o CMakeFiles/clogan.dir/json_util.c.s

clogan.out/CMakeFiles/clogan.dir/aes_util.c.o: clogan.out/CMakeFiles/clogan.dir/flags.make
clogan.out/CMakeFiles/clogan.dir/aes_util.c.o: Clogan/aes_util.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/wangtiegang3/projects/github/DemoApplication/logan/CMakeFiles --progress-num=$(CMAKE_PROGRESS_7) "Building C object clogan.out/CMakeFiles/clogan.dir/aes_util.c.o"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/clogan.dir/aes_util.c.o -c /Users/wangtiegang3/projects/github/DemoApplication/logan/Clogan/aes_util.c

clogan.out/CMakeFiles/clogan.dir/aes_util.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/clogan.dir/aes_util.c.i"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/wangtiegang3/projects/github/DemoApplication/logan/Clogan/aes_util.c > CMakeFiles/clogan.dir/aes_util.c.i

clogan.out/CMakeFiles/clogan.dir/aes_util.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/clogan.dir/aes_util.c.s"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/wangtiegang3/projects/github/DemoApplication/logan/Clogan/aes_util.c -o CMakeFiles/clogan.dir/aes_util.c.s

clogan.out/CMakeFiles/clogan.dir/directory_util.c.o: clogan.out/CMakeFiles/clogan.dir/flags.make
clogan.out/CMakeFiles/clogan.dir/directory_util.c.o: Clogan/directory_util.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/wangtiegang3/projects/github/DemoApplication/logan/CMakeFiles --progress-num=$(CMAKE_PROGRESS_8) "Building C object clogan.out/CMakeFiles/clogan.dir/directory_util.c.o"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/clogan.dir/directory_util.c.o -c /Users/wangtiegang3/projects/github/DemoApplication/logan/Clogan/directory_util.c

clogan.out/CMakeFiles/clogan.dir/directory_util.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/clogan.dir/directory_util.c.i"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/wangtiegang3/projects/github/DemoApplication/logan/Clogan/directory_util.c > CMakeFiles/clogan.dir/directory_util.c.i

clogan.out/CMakeFiles/clogan.dir/directory_util.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/clogan.dir/directory_util.c.s"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/wangtiegang3/projects/github/DemoApplication/logan/Clogan/directory_util.c -o CMakeFiles/clogan.dir/directory_util.c.s

clogan.out/CMakeFiles/clogan.dir/base_util.c.o: clogan.out/CMakeFiles/clogan.dir/flags.make
clogan.out/CMakeFiles/clogan.dir/base_util.c.o: Clogan/base_util.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/wangtiegang3/projects/github/DemoApplication/logan/CMakeFiles --progress-num=$(CMAKE_PROGRESS_9) "Building C object clogan.out/CMakeFiles/clogan.dir/base_util.c.o"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/clogan.dir/base_util.c.o -c /Users/wangtiegang3/projects/github/DemoApplication/logan/Clogan/base_util.c

clogan.out/CMakeFiles/clogan.dir/base_util.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/clogan.dir/base_util.c.i"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/wangtiegang3/projects/github/DemoApplication/logan/Clogan/base_util.c > CMakeFiles/clogan.dir/base_util.c.i

clogan.out/CMakeFiles/clogan.dir/base_util.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/clogan.dir/base_util.c.s"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/wangtiegang3/projects/github/DemoApplication/logan/Clogan/base_util.c -o CMakeFiles/clogan.dir/base_util.c.s

clogan.out/CMakeFiles/clogan.dir/console_util.c.o: clogan.out/CMakeFiles/clogan.dir/flags.make
clogan.out/CMakeFiles/clogan.dir/console_util.c.o: Clogan/console_util.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/wangtiegang3/projects/github/DemoApplication/logan/CMakeFiles --progress-num=$(CMAKE_PROGRESS_10) "Building C object clogan.out/CMakeFiles/clogan.dir/console_util.c.o"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/clogan.dir/console_util.c.o -c /Users/wangtiegang3/projects/github/DemoApplication/logan/Clogan/console_util.c

clogan.out/CMakeFiles/clogan.dir/console_util.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/clogan.dir/console_util.c.i"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /Users/wangtiegang3/projects/github/DemoApplication/logan/Clogan/console_util.c > CMakeFiles/clogan.dir/console_util.c.i

clogan.out/CMakeFiles/clogan.dir/console_util.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/clogan.dir/console_util.c.s"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /Users/wangtiegang3/projects/github/DemoApplication/logan/Clogan/console_util.c -o CMakeFiles/clogan.dir/console_util.c.s

# Object files for target clogan
clogan_OBJECTS = \
"CMakeFiles/clogan.dir/clogan_core.c.o" \
"CMakeFiles/clogan.dir/mmap_util.c.o" \
"CMakeFiles/clogan.dir/cJSON.c.o" \
"CMakeFiles/clogan.dir/construct_data.c.o" \
"CMakeFiles/clogan.dir/zlib_util.c.o" \
"CMakeFiles/clogan.dir/json_util.c.o" \
"CMakeFiles/clogan.dir/aes_util.c.o" \
"CMakeFiles/clogan.dir/directory_util.c.o" \
"CMakeFiles/clogan.dir/base_util.c.o" \
"CMakeFiles/clogan.dir/console_util.c.o"

# External object files for target clogan
clogan_EXTERNAL_OBJECTS =

clogan.out/libclogan.a: clogan.out/CMakeFiles/clogan.dir/clogan_core.c.o
clogan.out/libclogan.a: clogan.out/CMakeFiles/clogan.dir/mmap_util.c.o
clogan.out/libclogan.a: clogan.out/CMakeFiles/clogan.dir/cJSON.c.o
clogan.out/libclogan.a: clogan.out/CMakeFiles/clogan.dir/construct_data.c.o
clogan.out/libclogan.a: clogan.out/CMakeFiles/clogan.dir/zlib_util.c.o
clogan.out/libclogan.a: clogan.out/CMakeFiles/clogan.dir/json_util.c.o
clogan.out/libclogan.a: clogan.out/CMakeFiles/clogan.dir/aes_util.c.o
clogan.out/libclogan.a: clogan.out/CMakeFiles/clogan.dir/directory_util.c.o
clogan.out/libclogan.a: clogan.out/CMakeFiles/clogan.dir/base_util.c.o
clogan.out/libclogan.a: clogan.out/CMakeFiles/clogan.dir/console_util.c.o
clogan.out/libclogan.a: clogan.out/CMakeFiles/clogan.dir/build.make
clogan.out/libclogan.a: clogan.out/CMakeFiles/clogan.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/Users/wangtiegang3/projects/github/DemoApplication/logan/CMakeFiles --progress-num=$(CMAKE_PROGRESS_11) "Linking C static library libclogan.a"
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && $(CMAKE_COMMAND) -P CMakeFiles/clogan.dir/cmake_clean_target.cmake
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && $(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/clogan.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
clogan.out/CMakeFiles/clogan.dir/build: clogan.out/libclogan.a

.PHONY : clogan.out/CMakeFiles/clogan.dir/build

clogan.out/CMakeFiles/clogan.dir/clean:
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out && $(CMAKE_COMMAND) -P CMakeFiles/clogan.dir/cmake_clean.cmake
.PHONY : clogan.out/CMakeFiles/clogan.dir/clean

clogan.out/CMakeFiles/clogan.dir/depend:
	cd /Users/wangtiegang3/projects/github/DemoApplication/logan && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/wangtiegang3/projects/github/DemoApplication/logan /Users/wangtiegang3/projects/github/DemoApplication/logan/Clogan /Users/wangtiegang3/projects/github/DemoApplication/logan /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out /Users/wangtiegang3/projects/github/DemoApplication/logan/clogan.out/CMakeFiles/clogan.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : clogan.out/CMakeFiles/clogan.dir/depend

