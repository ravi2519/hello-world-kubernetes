# Stage 1
FROM node:lts-alpine as build-step
RUN mkdir -p /app
WORKDIR /app
COPY angular-hello-world/package.json /app
RUN npm install
COPY angular-hello-world/* /app
RUN npm run build --prod

# Stage 2
FROM nginx:stable-alpine
COPY --from=build-step /app/docs /usr/share/nginx/html
