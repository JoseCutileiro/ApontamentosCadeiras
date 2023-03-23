# Criar VENV
```
# Requisitos
> sudo apt install python3.10-venv

# windows
> python -m venv .venv
> .venv\Scripts\activate

# linux
$ python -m venv .venv
$ source .venv/bin/activate

Cria uma diretoria .venv
```

# Install GRPCIO

```
python -m pip install grpcio
python -m pip install grpcio-tools

or

pip3 install grpcio
pip3 install grpcio-tools
```

# Compilar proto

```
python -m grpc_tools.protoc -I<pasta-para-o-contrato> --python_out=<diretoria-output> --grpc_python_out=<diretoria-output> <protos-para-compilar>
```