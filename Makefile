redis_stack:
	docker run -d --name redis-stack-yourdreamcar -p 6379:6379 -p 8001:8001 redis/redis-stack:latest