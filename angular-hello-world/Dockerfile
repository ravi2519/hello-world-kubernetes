# Stage 1
FROM node:lts-alpine as build-step
RUN mkdir -p /app
WORKDIR /app
COPY package.json /app
RUN npm install
COPY . /app
RUN npm run build --prod

# Stage 2
FROM nginx:stable-alpine
COPY --from=build-step /app/dist/angular-hello-world /usr/share/nginx/html
