FROM docker.elastic.co/elasticsearch/elasticsearch:7.9.3
ENV ES_JAVA_OPTS="-Xmx256m -Xms256m"
ENV DISCOVERY_TYPE=single-node
ENV ELASTIC_PASSWORD=changeme
#CMD ["sudo sysctl -w vm.max_map_count=262144"]
EXPOSE 9200
EXPOSE 9300
# Add your elasticsearch plugins setup here
# Example: RUN elasticsearch-plugin install analysis-icu
