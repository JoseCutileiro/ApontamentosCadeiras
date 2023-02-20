/*
 * This is sample code generated by rpcgen.
 * These are only templates and you can use them
 * as a guideline for developing your own functions.
 */

#include "T01_counter.h"

int counter;

void *
limpa_1_svc(void *argp, struct svc_req *rqstp)
{
	static char * result;

	counter = 0;
	/*
	 * insert server code here
	 */

	return (void *) &result;
}

void *
inc_1_svc(int *argp, struct svc_req *rqstp)
{
	static char * result;

	counter++;

	return (void *) &result;
}

int *
consulta_1_svc(void *argp, struct svc_req *rqstp)
{
	static int  result;

	result = counter;

	return &result;
}
