#include <iostream>
#include <fstream>
#include <string>
#include <sstream>

#include <cstdio>
#include <cstdlib>

using namespace std;

int main(int argc, char *argv[])
{
	if( argc < 2 )
	{
		cout << "input file?" << endl;
		return -1;
	}

	fstream fin( argv[1] , ios::in );
	string input;

	for( int i = 0 ; getline( fin , input ) ; i++ )
	{
		cout << "*((volatile int *)io+";
		printf("%11d" , i );
		cout << ") = 0x";
	//	cout << "cpu.IF.IM.instruction[";
	//	printf("%3d", i);
	//	cout << "] = 32'h";

		// do something
		stringstream ss(input);
		string temp , rs , rt , rd , imm , sh , temp2;
		unsigned int now = 0;

		ss >> temp;					// command
		if( temp == "nop" )
		{
		}
		else if( temp == "add" )
		{
			ss >> rd;
			ss >> rs;
			ss >> rt;
			rs[0] = rt[0] = rd[0] = '0';
			now += 32;
			now += atoi( rd.c_str() ) * 2048;
			now += atoi( rt.c_str() ) * 65536;
			now += atoi( rs.c_str() ) * 2097152;
		}
		else if( temp == "sub" )
		{
			ss >> rd;
			ss >> rs;
			ss >> rt;
			rs[0] = rt[0] = rd[0] = '0';
			now += 34;
			now += atoi( rd.c_str() ) * 2048;
			now += atoi( rt.c_str() ) * 65536;
			now += atoi( rs.c_str() ) * 2097152;
		}
		else if( temp == "mul" )
		{
			ss >> rd;
			ss >> rs;
			ss >> rt;
			rs[0] = rt[0] = rd[0] = '0';
			now += 1;
			now += atoi( rd.c_str() ) * 2048;
			now += atoi( rt.c_str() ) * 65536;
			now += atoi( rs.c_str() ) * 2097152;
		}
		else if( temp == "addi" )
		{
			ss >> rt;
			ss >> rs;
			ss >> imm;
			rs[0] = rt[0] = '0';
			now += atoi( imm.c_str() );
			now += atoi( rt.c_str() ) * 65536;
			now += atoi( rs.c_str() ) * 2097152;
			now += 536870912;
		}
		else if( temp == "sll" )
		{
			ss >> rd;
			ss >> rt;
			ss >> sh;
			rd[0] = rt[0] = '0';
			now += atoi( sh.c_str() ) * 64;
			now += atoi( rd.c_str() ) * 2048;
			now += atoi( rt.c_str() ) * 65536;
		}
		else if( temp == "sra" )
		{
			ss >> rd;
			ss >> rt;
			ss >> sh;
			rd[0] = rt[0] = '0';
			now += 2;
			now += atoi( sh.c_str() ) * 64;
			now += atoi( rd.c_str() ) * 2048;
			now += atoi( rt.c_str() ) * 65536;
		}
		else if( temp == "lw" )
		{
			ss >> rt;
			ss >> temp2;
			rt[0] = '0';
			for( size_t j = 0 ; j < temp2.length() ; j++ )
			{
				if( temp2[j] == '(' || temp2[j] == '$' || temp2[j] == ')' )
				{
					temp2[j] = ' ';
				}
			}
			stringstream ss2(temp2);
			ss2 >> imm;
			ss2 >> rs;

			now += atoi( imm.c_str() );
			now += atoi( rt.c_str() ) * 65536;
			now += atoi( rs.c_str() ) * 2097152;
			now += 2348810240;
		}
		else if( temp == "sw" )
		{
			ss >> rt;
			ss >> temp2;
			rt[0] = '0';
			for( size_t j = 0 ; j < temp2.length() ; j++ )
			{
				if( temp2[j] == '(' || temp2[j] == '$' || temp2[j] == ')' )
				{
					temp2[j] = ' ';
				}
			}
			stringstream ss2(temp2);
			ss2 >> imm;
			ss2 >> rs;

			now += atoi( imm.c_str() );
			now += atoi( rt.c_str() ) * 65536;
			now += atoi( rs.c_str() ) * 2097152;
			now += 2885681152;
		}
		else
		{
			cout << "known" << endl;
		}
		printf( "%08x" , now );

		cout << ";" << endl;
	}


	return 0;
}
