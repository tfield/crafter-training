long start = System.nanoTime()

filterChain.doFilter(request, response)

long elapsedNanos = System.nanoTime() - start
long elapsedMillis = elapsedNanon / 1000000
response.setHeader("X-TONY-ELAPSED-TIME", elapsedMillis)
