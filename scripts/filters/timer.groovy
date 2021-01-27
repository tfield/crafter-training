long start = System.currentTimeMillis()

filterChain.doFilter(request, response)

long elapsedMillis = System.currentTimeMillis() - start
response.setHeader("X-TONY-ELAPSED-TIME", elapsedMillis)
