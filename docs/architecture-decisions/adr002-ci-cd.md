# Continuous Integration and Continuous Deployment

- Status: in progress
- Date: 06.11.2022

## Context

I want to automate deployment and integration as much as possible and use best practices and tools to do so.

## Considered Options

### Code Storage:

- Github
- Gitlab

### CI/CD Platform:

- Jenkins
- GitLab
- GitHub Actions
- Travis CI

### Cloud:

- AWS
- Digital Ocean
- Linode

### Docker Container Registry:

- Docker Hub
- AWS ECR
- GitHub Package Registry
- Harbor Container Registry
- Nexus

### Container Orchestration:

- AWS ECS
- AWS EKS
- AWS Fargate
- Nomad

## Decision Outcome

When summed up, the main points for decisions were the ease of implementation and the popularity of the tools on the
market

### Code Storage

**GitHub:**

- The most famous web-based Git repository hosting service
- Currently, the best free tier to use

### CI/CD Platform

**GitHub Actions** - based on the previous decision, the easiest option for integration with GitHub

### Cloud

**AWS:**

- The most famous and used cloud on the market
- Good free tier
- For the practice of working with it

### Docker Container Registry

**AWS ECR** - based on the previous decision, the easiest option for integration with AWS

### Container Orchestration

**AWS ECS + EC2:**

- Easy to integration with AWS
- Totally free
- Using of kubernetes unnecessary at this stage

## Links

- [CI/CD Overview](../practices/ci-cd.md) 