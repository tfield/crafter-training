long start = System.currentTimeMillis()

//create filter
filterChain.doFilter(request, response)

long elapsedMillis = System.currentTimeMillis() - start
logger.info("Elapsed time: "+elapsedMillis)