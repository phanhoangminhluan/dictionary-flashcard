# https://www.docker.elastic.co/
FROM docker.elastic.co/kibana/kibana:7.9.3
# Add your kibana plugins setup here
# Example: RUN kibana-plugin install <name|url>
ENV SERVER_NAME=kibana
ENV SERVER_HOST=0.0.0.0
ENV ELASTICSEARCH_HOST="http://elasticsearch:9200"
ENV ELASTICSEARCH_USERNAME=elastic
ENV ELASTICSEARCH_PASSWORD=changeme
EXPOSE 5601