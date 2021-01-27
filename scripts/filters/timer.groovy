long start = System.currentTimeMillis()

filterChain.doFilter(request, response)

long elapsedMillis = System.currentTimeMillis() - start
logger.info("Elapsed time for uri:"+request.getRequestURI() + ": "+elapsedMillis)
