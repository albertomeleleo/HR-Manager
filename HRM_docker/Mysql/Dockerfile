# Use the official MySQL image from the Docker Hub
FROM mysql:8.0

# Copy the SQL file into the Docker image
COPY init.sql /docker-entrypoint-initdb.d/

# Expose the MySQL port
EXPOSE 3306

# The default command will start MySQL
CMD ["mysqld"]